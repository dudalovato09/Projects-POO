/*Leia 5 notas de um aluno utilizando o comando for, calcule e exiba a média
das notas do aluno e, em seguida, exiba a relação de notas cuja nota é superior
a esta média.*/

package Aula_02;
import java.util.Scanner;

public class Exercício_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i;
		float media, valor_total;
		float[] notas = new float[5];

		valor_total = 0;

		for (i = 0; i < 5; i++) {
			System.out.println("Digite a nota " + (i + 1) + ":");
			notas[i] = scan.nextFloat();

			valor_total += notas[i];
		}

		media = valor_total / 5;
		
		System.out.println("A média do aluno é: " + media);

		System.out.println("Notas superiores à média:");

		for (i = 0; i < notas.length; i++) { // notas.length retorna o tamanho do array 'notas'
			
			if (notas[i] > media) {
				System.out.println(notas[i]);
			}
		}
		
		scan.close();
	}
}
