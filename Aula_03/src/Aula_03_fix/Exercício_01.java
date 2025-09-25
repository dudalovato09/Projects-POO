/* Elaborar um programa que leia sucessivamente valores numéricos e
apresente no final o somatório, a média e o total de valores lidos. O programa
deve ler os valores enquanto o usuário estiver fornecendo valores positivos. Ou
seja, o programa deve parar quando o usuário fornecer um valor negativo (menor
que zero). */

package Aula_03_fix;

import java.util.Scanner;

public class Exercício_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double valor = 0, total = 0, media = 0;
		int cont = 0;
		
		do {
			System.out.println("Digite um valor numérico: ");
			valor = scan.nextDouble();
			if (valor > 0 ) {
				cont++;
			}
			
			total += valor;
			
		}while(valor > 0);
		
		media = total / cont;
		
		System.out.println("A soma de todos os números lidos foi de: " + total);
		System.out.println("A média dos números lidos foi de: " + media);
		System.out.println("Foram lidos " + cont + " números");
		
		scan.close();
	}

}
