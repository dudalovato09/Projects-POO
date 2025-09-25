/*Escreva um programa para preencher valores de um vetor de inteiros com 10
posições. O usuário irá informar os valores a serem inseridos e suas respectivas
posições no array. O programa deve tratar as exceções
ArrayIndexOutOfBoundsException quando for informada uma posição
inexistente do vetor e NumberFormatException quando o valor informado não for
número.*/

package Aula_05;

import java.util.Scanner;

public class Exercício_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int vetor[] = new int[10];
		int valor;
		int posicao;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Insira um valor e a sua posição (0-9): ");
			try {
				System.out.print("Valor: ");
				valor = Integer.parseInt(scan.nextLine());

				System.out.print("Posição: ");
				posicao = Integer.parseInt(scan.nextLine());

				vetor[posicao] = valor;
			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida. Digite um número.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posição inválida. Digite um número entre 0 - 9");
			}
		}

		System.out.println("Valores inseridos no vetor:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Posição " + i + ": " + vetor[i]);
		}
		scan.close();
	}
}
