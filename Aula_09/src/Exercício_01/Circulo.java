package Exercício_01;

public class Circulo extends Forma {

	private float raio;

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	@Override
	public float calculaArea() {
		return (float) (Math.PI * raio * raio);
	}

}
