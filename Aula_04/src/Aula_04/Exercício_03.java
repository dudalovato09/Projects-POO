/*Declare um vetor de três posições, atribua valores de forma aleatória entre 0
e 30. Após leia cinco valores realizando tratamento de exceção, se o valor estiver
no vetor, escreva uma mensagem informando que o vetor contém o valor
informado.*/

package Aula_04;

import java.util.Random;
import java.util.Scanner;

public class Exercício_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int vetor[] = new int [3];
		int valor;
		boolean encontrado = false;
		Random random = new Random();
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(31);
			System.out.println(vetor[i]);
		}
		
		System.out.println("Digite 5 valores para verificação no vetor:");
		
		for(int i = 0; i < 5; i++) {
			try {
				System.out.println("Valor: " );
				valor = scan.nextInt();
				
				for (int num : vetor) {
					if(num == valor) {
						 encontrado = true;
	                        break;
					}
				}
			
			
			if(encontrado ) {
				System.out.println("O vetor CONTÉM o valor " + valor);
			}else {
				System.out.println("O vetor NÃO contém o valor "+ valor);
			}
			
		}catch(Exception error) {
			 System.out.println("Erro: Insira um número válido.");
             scan.next(); // Limpa o buffer do scanner
             i--; // Perm
		}
	}
		
		scan.close();
	}

}
