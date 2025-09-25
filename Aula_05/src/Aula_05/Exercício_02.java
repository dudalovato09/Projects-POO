/*Escreva um programa que leia uma frase e gere uma exceção caso não
contenha a palavra “teste” na frase digitada.*/

package Aula_05;

import java.util.Scanner;

public class Exercício_02 {

	public static void main(String[] args) throws TesteException{ //Quando é uma exceção criado por nós é preciso colocar aqui
		Scanner scan = new Scanner(System.in);
		String frase;

		try {

			System.out.println("Digite uma frase: ");
			frase = scan.nextLine();

			if (!frase.contains("teste")) {
				throw new TesteException(); // Chama a função que verifica
			} else {
				System.out.println("Frase Válida!!");
			}
		} catch (Exception error) {
			System.out.println("Frase inválida. " + error.getMessage());
		} finally {
			scan.close();
		}
	}

}
