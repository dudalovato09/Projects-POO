package Exercício_02;

public class Produto {

	protected String nome;
	protected float preco;
	protected int qntdEstoque;
	
	public float calcularPrecoTotal() {
		return preco * qntdEstoque;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getQntdEstoque() {
		return qntdEstoque;
	}
	public void setQntdEstoque(int qntdEstoque) {
		this.qntdEstoque = qntdEstoque;
	}
}
