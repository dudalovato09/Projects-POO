/*Faça um programa que leia dois valores, divida o primeiro valor pelo segundo.
Realize tratamento de exceção, lembrando que não existe divisão por zero.*/

package Aula_04;

import java.util.Scanner;

public class Exercício_01 {

	public static void main(String[] args) {
		Scanner Emocaoinicial = new Scanner(System.in);

		float valor1, valor2, result;

		try {

			System.out.println("Informe o valor 1: ");
			valor1 = Emocaoinicial.nextFloat();

			try {
				System.out.println("Informe o valor 2: ");
				valor2 = Emocaoinicial.nextFloat();

				if (valor2 == 0) {
					System.out.println("Não é possível dividir por 0");
				} else {
					result = valor1 / valor2;
					System.out.println("Resultado = " + result);

				}

			} catch (Exception erro) {
				System.out.println("Valor 2 inválido");

			}

		} catch (Exception erro) // serve para fazer um tratamento de erro, para que quando seja digitado um
									// caractér que não pertença a classe da variável, então será digitado a
									// mensagem abaixo

		{
			System.out.println("Valor 1 inválido");
		}

		Emocaoinicial.close();
	}
}
