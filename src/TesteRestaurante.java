import java.awt.Menu;
import java.util.Scanner;

public class TesteRestaurante {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("------------------------");
		System.out.println("  -----CARDÁPIO-----");
		System.out.println("------------------------");
		System.out.println("Por favor, informe o seu nome:");
		String novoCliente = scanner.nextLine();
		Pedido novoPedido = new Pedido(novoCliente);
		int menu;
		do {
			System.out.println("Faça o seu pedido, conforme as opções abaixo:");
			System.out.println("01-Lanche.");
			System.out.println("02-Bebida.");
			System.out.println("03-Taxa de serviço.");
			System.out.println("04-Fechar pedido.");
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Qual lanche você deseja?");
				String novoItem = scanner.next();

				System.out.println("Qual o preço do seu lanche?");
				double novoPreco = scanner.nextDouble();

				System.out.println("Qual o peso do seu lanche?");
				double novoPeso = scanner.nextDouble();

				System.out.println("Quais os ingredientes do seu lanche?");
				String novosIngredientes = scanner.next();

				//String nomeItem, double preco, double peso, String ingredientes

				Lanche novoLanche = new Lanche(novoItem, novoPreco, novoPeso, novosIngredientes);
				novoPedido.getItensConsumidos().add(novoLanche);

				break;

			case 2:
				System.out.println("Qual o preço de sua bebida?");
				double adquirirPreco = scanner.nextDouble();

				System.out.println("Qual será sua bebida?");
				String adquirirBebida = scanner.next();

				System.out.println("Qual o volume de sua bebida?");
				int novoVolume = scanner.nextInt();

				System.out.println("Bebida alcoolica?");
				System.out.println("[1] SIM");
				System.out.println("[2] NÃO");

				int temAlcool = scanner.nextInt();

				System.out.println("Qual sua idade?");
				int idade = scanner.nextInt();

				if (temAlcool == 1 && idade >= 18) {
					System.out.println("Pode comprar bebida alcoolica!");
				} else {
					System.out.println("Você não pode comprar bebida alcoolica!");
				}

				//				
				//Essa parte também pode ser feita atravéz de Boolean 
				//				
				//boolean temAlcool = scanner.nextBoolean();
				//				
				//System.out.println("Qual sua idade?");
				//int idade = scanner.nextInt();
				//
				//if (temAlcool != false  && idade >= 18) {
				//System.out.println("Pode comprar bebida alcoolica!");
				//} else {
				//System.out.println("Você não pode comprar bebida alcoolica!");
				//}				

				//public Bebida(double preco, String nomeItem, int volume, boolean bebidaAlcoolica)

				Bebida novaBebida = new Bebida(adquirirPreco, adquirirBebida, novoVolume, temAlcool == 1);
				novoPedido.getItensConsumidos().add(novaBebida);
				break;

			case 3:
				System.out.println("Deseja incluir a taxa de serviço ao seu Pedido");
				System.out.println("1 - SIM");
				System.out.println("2 - NÃO");
				int opcao = scanner.nextInt();
				if (opcao == 1) {
					novoPedido.taxaDeServico = true;
				} else {
					novoPedido.taxaDeServico = false;
				}
				break;

			case 4:
				System.out.println("Fechar pedido");
				novoPedido.gerarFatura();

				break;
			}
		} while (menu < 4);

		scanner.close();
	}
}
