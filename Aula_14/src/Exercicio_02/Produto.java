package Exercicio_02;

public abstract class Produto {
	
	private float precoUnitario;
	
	public Produto (float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	public abstract float aplicarDesconto();

	public float getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
}
