package model;

public class ItemVenda {

	private int quantidade;
	
	private Produto produto;
	
	public float getSubtotal() {
		return produto.getPreco() * quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}