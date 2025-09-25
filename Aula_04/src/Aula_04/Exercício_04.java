/*Leia dois valores, realize tratamento de exceção, caso os valores informados
sejam válidos, declare uma variável que receba um valor randômico entre 0 e o
maior valor e mostre o resultado.*/

package Aula_04;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int valor1 = 0, valor2 = 0, maior, n;
		Random random = new Random();
		
		
		try {
			System.out.println("Informe o valor 1: ");
			valor1 = scan.nextInt();
			
			System.out.println("Informe o valor 2: ");
			valor2 = scan.nextInt();
				
			if(valor1 >= valor2) {
				maior = valor1;
			}else {
					maior = valor2;
			}
			
			n = random.nextInt(maior +1);
			System.out.println("Valor randômico: " + n);

			
		}catch(Exception error) {
			System.out.println("Valor informado inválido");
			scan.next().charAt(0); //limpa o buffer do teclado
		}
	}
}
