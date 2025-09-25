/*Faça um programa que leia um valor double e escreva-o na tela. Faça
tratamento de exceção, o programa deve permanecer pedindo um valor até que
seja digitado um valor válido.*/

package Aula_04;

import java.util.Scanner;

public class Exercício_02 {

	public static void main(String[] args) {
		Scanner Emocaoinicial = new Scanner(System.in);
		
		double valor;
		
		boolean excecao = true; //variavel de verdadeiro ou falso
		
		while(excecao ==true) {
			try {
				System.out.println("Informe o valor: ");
				valor = Emocaoinicial.nextDouble();
				System.out.println("Valor informado é válido");
				excecao = false;
			}
			catch (Exception erro) {
				System.out.println("Valor inválido");
				Emocaoinicial.next().charAt(0); //limpa o buffer do teclado
			}
		}
			Emocaoinicial.close();
		}

}
