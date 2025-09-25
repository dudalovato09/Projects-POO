/*Leia três notas de um aluno, se a média for maior ou igual a 7, o aluno está
aprovado, se a média for maior ou igual a 5 e menor que 7, o aluno está em
recuperação, senão o aluno está reprovado. Mostre a mensagem correta*/

package Aula_02;
import java.util.Scanner;

public class Exercício_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float nota1, nota2, nota3, media;

		System.out.println("Informe a primeira nota:");
		nota1 = scan.nextFloat();
		
		System.out.println("Informe a segunda nota:");
		nota2 = scan.nextFloat();
		
		System.out.println("Informe a terceira nota:");
		nota3 = scan.nextFloat();
		
		media = (nota1 + nota2 + nota3)/3;
		
		if(media >= 7 ) {
			System.out.println("Parabéns!! Você foi aprovado :)");
		}else if(media >= 5 && media < 7 ) {
			System.out.println("Você está de recuperação :|");
		}else {
			System.out.println("Que pena... Você foi reprovado :(");
		}
		
		scan.close();
	}
}
