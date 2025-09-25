package Exercício_01;

public class Quadrado implements Forma{
	
	private float lado;

	@Override
	public float calculaPerimetro() {
		return 4 * lado;
	}

	
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	

}
