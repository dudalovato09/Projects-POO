/*Elaborar um software que calcule e apresente o volume de uma caixa retangular, 
por meio da fórmula: 
 
VOLUME = COMPRIMENTO * LARGURA * ALTURA */

package Aula_02_fix;

import java.util.Scanner;

public class Exercício_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double volume, comprimento, largura, altura;
		
		System.out.println("Digite o comprimento da caixa: ");
		comprimento = scan.nextDouble();
		
		System.out.println("Digite a alutra da caixa: ");
		altura = scan.nextDouble();
		
		System.out.println("Digite a largura da caixa:: ");
		largura = scan.nextDouble();
		
		volume = comprimento * largura * altura;
		
		System.out.println("O volume dessa caixa é: " + volume);
		
		scan.close();
	}

}
