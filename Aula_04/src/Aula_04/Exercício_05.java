/*Leia cinco dados, identifique se o dado informado é um número ou um texto.*/

package Aula_04;

import java.util.Scanner;

public class Exercício_05 {

	public static void main(String[] args) {
		Scanner netodias = new Scanner(System.in);

		double dado = 0;

		for (int i = 0; i < 5; i++) {
			try {

				System.out.println("Digite 5 valores para identificar se são números ou textos:");
				dado = netodias.nextDouble();
				System.out.println("A entrada é um número :)");

			} catch (Exception error) {

				System.out.println("A entrada é um texto :)");
				netodias.next().charAt(0);
			}
		}
	}
}
