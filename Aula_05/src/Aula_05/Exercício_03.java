/*Leia 10 valores do tipo inteiro e armazene em um vetor. Trate a exceção
InputMismatchException.*/

package Aula_05;

//Essa biblioteca reconhece se o valor da entrada é um número inteiro.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercício_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] vetor = new int [10];
		
		try {
			System.out.println("Informe 10 valores: ");
			for(int i = 0; i < 10; i++) {
				vetor[i] = scan.nextInt();
			}
			System.out.println("Valores dentro do vetor:");
			for(int i = 0; i < 10; i++) {
				System.out.println(vetor[i]);
			}
		}catch (InputMismatchException erro) {
			System.out.println("Você não digitou um número inteiro.");
		}
		catch(Exception erro) {
			System.out.println("Erro! Tente novamente mais tarde..");
		}
		finally {
			scan.close();	
		}	
	}
}
