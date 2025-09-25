/*Leia uma matriz soma 3X3, calcule e escreva as seguintes somas:
a) da linha 3.
b) da coluna 2.
c) de todos os elementos da matriz.*/

package Aula_03;

import java.util.Scanner;

public class Exercício_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double [][] matrizEmocionante = new double [4][4];
		double linha3 = 0, coluna2 = 0, total = 0;
		
		System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizEmocionante[i][j] = scan.nextDouble();
                
                if (i == 3) {
                	linha3 += matrizEmocionante[i][j];
                }
                
                if (j == 2) {
                	coluna2 += matrizEmocionante[i][j];
                }
                
                total += matrizEmocionante[i][j];
            }
        }
		
        System.out.println("A soma dos elementos da 3ª linha é: " + linha3);
		System.out.println("A soma dos elementos da 2ª coluna é: " + coluna2);
		System.out.println("A soma de todos os elementos é: " + total);
		
		scan.close();
	}

}
