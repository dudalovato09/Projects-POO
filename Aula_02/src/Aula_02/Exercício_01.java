/*Ler um número inteiro e determinar se é divisível por 5. Se for divisível, escreva
uma mensagem na tela “O número xx é divisível por 5”. Se não for, imprima: “O
número xx não é divisível por 5”.*/

package Aula_02;
import java.util.Scanner;

public class Exercício_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("Informe o número:");
		num = scan.nextInt();
		
		if (num % 5 == 0) {
			System.out.println("O número " + num + " é divisível por 5");
		}else{
			System.out.println("O número " + num + " não é divisível por 5");
		}
		
		scan.close();
	}

}
