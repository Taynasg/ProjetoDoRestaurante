
public abstract class Item {

	// Atributos

	private double preco;
	private String nomeItem;

	// Construtor

	public Item(double preco, String nomeItem) {
		this.preco = preco;
		this.nomeItem = nomeItem;
	}

	// Getters e Setters

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nome) {
		this.nomeItem = nome;
	}

}
