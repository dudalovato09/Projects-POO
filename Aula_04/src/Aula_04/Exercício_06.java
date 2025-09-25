/*Declare um vetor de três posições, o software deve permanecer pedindo para
o usuário digitar um valor, até que o mesmo digite três valores válidos, os valores
válidos devem ser armazenados no vetor.*/

package Aula_04;

import java.util.Scanner;

public class Exercício_06 {

	public static void main(String[] args) {
		Scanner netodias = new Scanner(System.in);

		int[] numero = new int[3];

		for (int i = 0; i < 3; i++) {
			boolean excecao = true;
			while (excecao == true) {
				try {
					System.out.println("Informe um valor: ");
					numero[i] = netodias.nextInt();
					excecao = false;
				} catch (Exception error) {
					System.out.println("Valor inválido");
					netodias.next().charAt(0);
				}

			}

		}

		System.out.println("Valores armazenados o vetor: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(numero[i]);
		}
		netodias.close();
	}

}
