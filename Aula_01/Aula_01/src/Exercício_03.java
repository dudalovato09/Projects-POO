/* Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus
Celsius. A fórmula de conversão de temperatura a ser utilizada é C = (F - 32) *5
/ 9, em que a variável F é a temperatura em graus Fahrenheit e a variável C é a
temperatura em graus Celsius. */

import java.util.Scanner;

public class Exercício_03 {

	public static void main(String[] args) {
		
		Scanner posIntervalo = new Scanner(System.in);
		float f, c;
		
		System.out.println("Informe a temperatura em Fahrenheit: ");
		f = posIntervalo.nextFloat();
		c = (f - 32) * 5 / 9;
		
		System.out.println("A temperatura em Celcius é: " + c);
		
		posIntervalo.close();
	}
}
