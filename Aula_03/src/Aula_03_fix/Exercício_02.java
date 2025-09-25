/* Faça um software que leia uma matriz 2X2, a seguir multiplique cada elemento
da matriz lida por 2 e escreva na tela o resultado. */

package Aula_03_fix;

import java.util.Scanner;

public class Exercício_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [][] matriz = new int [2][2];
		int i, j;
		
		for( i = 0; i< 2; i++) {
			for(j = 0; j < 2; j++) {
				System.out.println("Elemento [" +i+ "][" +j+ "] - Digite um valor:");
				matriz[i][j] = scan.nextInt();
				
			}
		}
		
		System.out.println("\nMatriz digitada:");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print(matriz[i][j] + " ");
			}
				System.out.println();
		}
		
		System.out.println("Matriz após multiplicação por 2: ");
		for(i = 0; i < 2; i++) {
			for(j = 0; j < 2; j++) {
				System.out.print((matriz[i][j] * 2) + " ");
			}
			System.out.println();
		}
		
		scan.close();
	}
}
