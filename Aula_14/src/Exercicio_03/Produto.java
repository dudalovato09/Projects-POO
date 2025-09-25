package Exercicio_03;

public class Produto {
	
	private final int codigo;
	private float precoVenda;
	
	public Produto (int codigo, float precoVenda) {
		this.codigo = codigo;
		this.precoVenda = precoVenda;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}

	public int getCodigo() {
		return codigo;
	}
}
