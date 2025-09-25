/*Leia uma matriz 2x2, logo após leia um valor e verifique se este valor existe
dentro da matriz*/

package Aula_02;

import java.util.Scanner;

public class Exercício_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float[][] matrizEmocionante = new float [2][2];
		float num; 
		
		 System.out.println("Digite os valores da matriz 2x2:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print("Elemento [" + i + "][" + j + "]: ");
	                matrizEmocionante[i][j] = scan.nextInt();
	            }
	        }
	        
	        System.out.println("Digite um valor: ");
	        num = scan.nextFloat();	
			
	        // Verificação se o valor existe na matriz
	        boolean encontrado = false;
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                if (matrizEmocionante[i][j] == num) {
	                    encontrado = true;
	                    break;
	                }
	            }
	            if (encontrado) break;
	        }

	        // Exibição do resultado
	        if (encontrado) {
	            System.out.println("\nO valor " + num + " foi encontrado na matriz.");
	        } else {
	            System.out.println("\nO valor " + num + " não foi encontrado na matriz.");
	        }

	        scan.close();
	}

}
