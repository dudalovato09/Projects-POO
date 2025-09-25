/* Elabore um software que leia três valores digitados pelo usuário (nota 1, nota
2 e nota 3) e calcule e mostre a média aritmética destes três valores. */

import java.util.Scanner;

public class Exercício_04 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		float valor1, valor2, valor3, resultado;
		
		System.out.println("Informe o valor 1: "); 
		valor1 = teclado.nextFloat();
		
		System.out.println("Informe o valor 2: "); 
		valor2 = teclado.nextFloat();
		
		System.out.println("Informe o valor 3: "); 
		valor3 = teclado.nextFloat();
		
		resultado = (valor1 + valor2 + valor3) / 3;
		System.out.println("A média aritmética é: " + resultado);
		
		teclado.close(); 
	}
}
