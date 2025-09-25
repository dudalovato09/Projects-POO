package Exercício_01;

public class Retangulo implements Forma {

	private float base, altura;
	
	@Override
	public float calculaPerimetro() {
		return base * 2 + altura * 2;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	

}
