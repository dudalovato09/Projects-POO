/*Faça um programa que, para um número indeterminado de pessoas: leia a
idade de cada pessoa, sendo que a leitura da idade 0 (zero) indica o fim dos
dados e não deve ser considerada:
- calcule e escreva o número de pessoas;
- calcule e escreva a idade média do grupo.*/

package Aula_03;

import java.util.Scanner;

public class Exercício_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int idade, contador = 0, totalIdade = 0, media = 0;
		
		do {
			System.out.println("Informe a idade: ");
			idade = scan.nextInt();
			
			if(idade != 0) {
				contador ++;
			}
			
			totalIdade += idade;
			media = totalIdade / contador;
		}while(idade != 0);
	
		System.out.println("A quantidade de pessoas que inseriram a idade foi: " + contador);
		System.out.println("A média de idade do grupo é de: " + media);
	}
}
