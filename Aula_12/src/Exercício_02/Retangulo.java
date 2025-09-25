package Exercício_02;

public class Retangulo extends Figura {

	private float base;
	private float altura;
	private static int contador = 0;

	public Retangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
		contador++;
	}

	@Override
	public float calculaArea() {
		return base * altura;
	}

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

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Retangulo.contador = contador;
	}

}
