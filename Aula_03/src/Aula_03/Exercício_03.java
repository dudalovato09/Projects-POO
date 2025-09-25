/*Calcule a exponenciação de dois números inteiros x e y entrados pelo teclado,
ou seja, obtenha xy só com multiplicação e um laço.*/

package Aula_03;

import java.util.Scanner;

public class Exercício_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x, y, resultudo = 1;

		System.out.println("Digite o valor da base (x): ");
		x = scan.nextInt();

		System.out.println("Digite o valor do expoente (y): ");
		y = scan.nextInt();

		for (int i = 0; i < y; i++) {
			resultudo *= x;
		}

		System.out.println(x + "^" + y + " = " + resultudo);

	}

}
