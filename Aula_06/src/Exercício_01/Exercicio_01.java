package Exercício_01;

public class Exercicio_01 {

	public static void main(String[] args) {
	
		Lampada lampada = new Lampada();
		
		lampada.desliga();
		System.out.println(lampada.observa());
		
		lampada.liga();
		System.out.println(lampada.observa());

		lampada.interruptor();
		System.out.println(lampada.observa());
	}
}
