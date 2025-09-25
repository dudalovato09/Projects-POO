/*Faça um programa que leia dois números e realize a divisão do primeiro valor
digitado pelo segundo valor. Faça tratamento de exceção. Utilize a exceção
ArithmeticException. Mostre na tela o resultado final.*/

package Aula_05;

import java.util.Scanner;

public class Exercício_01 {

	public static void main(String[] args) {
		Scanner buenogolinf = new Scanner(System.in);

		int valor1, valor2;
		float resultado;

		try {

			System.out.println("Informe o valor 1: ");
			valor1 = buenogolinf.nextInt();

			System.out.println("Informe o valor 2: ");
			valor2 = buenogolinf.nextInt();

			resultado = valor1 / valor2;

			System.out.println("Resultado: " + resultado);

			// Não pode ser invertida a ordem pois o exception error é qualquer erro
		} catch (ArithmeticException error) { // Erro matemático

			System.out.println("Não é possível dividir por zero");

		} catch (Exception error) { // Erro gráfico

			System.out.println("Você digitou texto ao invés de número");
			
		} finally { // Opcional, mas interessante pois executa se gerar ou não a exceção
			buenogolinf.close();
		}
	}
}
