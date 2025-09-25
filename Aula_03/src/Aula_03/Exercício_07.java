/*Leia a idade de oito pessoas, na sequência determine: a idade média do
grupo, a menor idade e a maior idade.*/

package Aula_03;

import java.util.Scanner;

public class Exercício_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i, idade, maior, menor, total_idade = 0, media = 0;

		System.out.println("Digite uma idade: ");
		idade = scan.nextInt();

		maior = idade;
		menor = idade;
		total_idade += idade;

		for (i = 1; i < 8; i++) {

			System.out.println("Digite uma idade: ");
			idade = scan.nextInt();
			
			if (idade > maior) {
				maior = idade;
			}

			if (idade < menor) {
				menor = idade;
			}

			total_idade += idade;

		}

		media = total_idade / 8;

		System.out.println("A média das idades é:" + media);
		System.out.println("A maior idade é " + maior);
		System.out.println("A menor idade é " + menor);
	}

}
