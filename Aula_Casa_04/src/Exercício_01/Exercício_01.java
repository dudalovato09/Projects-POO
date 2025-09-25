package Exercício_01;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercício_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] matriz = new int[3];
		
		try {
			System.out.println("Digite o primeiro valor: ");
			matriz[0] = scan.nextInt();
			
			System.out.println("Digite o primeiro valor: ");
			matriz[1] = scan.nextInt();
			
			System.out.println("Digite o primeiro valor: ");
			matriz[2] = scan.nextInt();
			
			// Biblioteca que ordena a matriz em ordem crescente.
			Arrays.sort(matriz);
			
			System.out.println("O segundo valor, depois da ordenação é: " + matriz[1]);
			
		}catch(InputMismatchException e) {
			System.out.println("Valor digitado inválido!!");
		}
		
		scan.close();
	}
}
