package Exercício_02;

public class Circulo extends Figura {

	private float raio;
	private static int contador = 0;

	public Circulo(float raio) {
		this.raio = raio;
		contador++;
	}

	@Override
	public float calculaArea() {
		return (float) (Math.PI * raio * raio);
	}

	@Override
	public float calculaPerimetro() {
		return (float) (2 * Math.PI * raio);
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Circulo.contador = contador;
	}

}
