package Exercício_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercício_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n1 = 0, n2 = 0, n3 = 0, total = 0;
		boolean entrada = false; // Será a validação da entrada de dados.. 
								 //	iniciamos em false para que caso todos os nº no laço sejam corretos, vira true.
		
		while (!entrada) {
			try {
				System.out.println("Digite o primeiro número:");
				n1 = scan.nextDouble();
				
				System.out.println("Digite o segundo número:");
				n2 = scan.nextDouble();
				
				System.out.println("Digite o terceiro número:");
				n3 = scan.nextDouble();
				
				// Se não houve erros de entrada de dados, entrada recebe true para assim sair do laço.
				entrada = true;
				
			}catch(InputMismatchException e) {
				System.out.println("Digite apenas números. Tente novamente!");
				scan.nextLine(); // limpa o buffer, para continuar digitando dados sem problemas.
			}
		}
		
		total = (n1 * n2) + n3;
		
		System.out.println("O resultado da expressão (n1 * n2) + n3 é: " + total);
		
		scan.close();
	}
}
