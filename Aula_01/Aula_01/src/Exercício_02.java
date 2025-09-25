/*Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
Fahrenheit. A fórmula de conversão da temperatura a ser utilizada é F = (9 * C +
160) / 5, em que a variável F representa a temperatura em graus Fahrenheit e a
variável C a temperatura em graus Celsius. */

import java.util.Scanner;

public class Exercício_02 {
	
	public static void main(String[] args) {
		
		Scanner posIntervalo = new Scanner(System.in);
		float f, c;
		
		System.out.println("Informe a temperatura em Celcius: ");
		c = posIntervalo.nextFloat();
		f = (9 * c + 160)/5;
		
		System.out.println("A temperatura em Fahrenheit é: " + f);
		
		posIntervalo.close();
	}

}
