/*Ler um número inteiro n. Escrever a soma de todos os números pares de 2
até n. Utilize o comando while para resolver o exercício.*/

package Aula_03;

import java.util.Scanner;

public class Exercício_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num, resultado = 0, i = 2;

		System.out.println("Informe um número: ");
		num = scan.nextInt();

		while (i <= num) {
			if (num % 2 == 0) {
				resultado += i;
				i += 2;
			}
		}
		
		System.out.println("A soma dos números pares neste intervalo é: " + resultado);
	}

}
