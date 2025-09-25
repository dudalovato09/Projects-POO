/*Dada uma matriz de ordem 2X2 faça um algoritmo que:
a) Calcule a soma dos elementos da primeira coluna.
b) Calcule o produto dos elementos da primeira linha.
c) Calcule a soma de todos os elementos da matriz.
d) Calcule a soma da diagonal principal.*/

package Aula_03;

import java.util.Scanner;

public class Exercício_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double [][] matrizEmocionante = new double [2][2];
		double soma_col = 0, produto = 1, soma = 0, soma_diag = 0;

		System.out.println("Digite os valores da matriz 2x2:");

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				matrizEmocionante[i][j] = scan.nextDouble();

				if (j == 0) {
					soma_col += matrizEmocionante[i][j];
				}
				
				if (i == 0) {
					produto *= matrizEmocionante[i][j];
				}

				soma += matrizEmocionante[i][j];
				
				if (i == j) {
					soma_diag += matrizEmocionante[i][j];
				}
			}
		}

		System.out.println("A soma dos elementos da 1º coluna é: " + soma_col);
		System.out.println("O produto dos elementos da 1º linha é: " + produto);
		System.out.println("A soma dos elementos é: " + soma);
		System.out.println("A soma dos elementos da diagonal principal é: " + soma_diag);
	}

}
