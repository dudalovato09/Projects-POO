package Exercício_01;

public class Retangulo extends Forma {

	private float largura;
	private float altura;

	
	public float getLargura() {
		return largura;
	}


	public void setLargura(float largura) {
		this.largura = largura;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	@Override // isso quer dizer qu está sobreescrevendo
	public float calculaArea() {
		return largura * altura;
	}

}
