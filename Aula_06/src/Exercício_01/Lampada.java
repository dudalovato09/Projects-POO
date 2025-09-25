package Exercício_01;

public class Lampada {
	private boolean ligada;
	
	public Lampada() {
		ligada = false;
	}
	
	public void liga() 
	{
		ligada = true;
	}
	
	public void desliga()
	{
		ligada = false;
	}
	
	public String observa() 
	{
		if (ligada == false) {
			return "Desligada";
		}else {
			return "Ligada";
		}
	}
	public void interruptor() {
		if (ligada == false) {
			ligada = true;
		}else {
			ligada = false;
		}
		// ligada = !ligada; 
		// if else resumido
	}
}
