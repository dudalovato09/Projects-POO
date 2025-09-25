/*Leia cinco valores inteiros utilizando o comando for, verifique qual deles é
maior e apresente na tela para o usuário.*/

package Aula_02;
import java.util.Scanner;

public class Exercício_04 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i, valor, maior;
		maior = 0;
		
		for (i = 1; i <= 5; i++) {
		    System.out.println("Digite um valor: ");
		    valor = scan.nextInt();
		    
		    if(valor > maior) {
		    	maior = valor;
		    }
		} 
		System.out.println("O maior valor é " + maior);
		
		scan.close();
	}

}
