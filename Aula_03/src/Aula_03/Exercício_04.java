/*Utilize a função Random que irá colocar um valor aleatório entre 0 e 99 em
uma variável qualquer, na sequência o usuário terá dez chances de tentar acertar
o valor, se o usuário informar o valor correto mostrará uma mensagem dando os
parabéns para o usuário, senão dará uma dica, indicando se o valor é maior ou
menor do que aquele que foi informado.
Random rnd = new Random();
int x = rnd.nextInt(100);*/

package Aula_03;

import java.util.Scanner;

import java.util.Random;

public class Exercício_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sorteio, valor, i;
		
		Random random = new Random();
		
		sorteio = random.nextInt(100);
		
		 System.out.println("Número aleatório: " + sorteio);
	
		for (i = 1; i <= 10; i++) {
		    System.out.println("Digite um valor: ");
		    valor = scan.nextInt();
		    
		    if (sorteio == valor) {
		    	System.out.println("Parabéns você acertou o número");
		    	break;
		    }
		    else if (valor < sorteio) {
		    	System.out.println("Dica: O número inserido é menor que o número sorteado");
		    }else if (valor > sorteio){
		    	System.out.println("Dica: O número inserido é maior que o número sorteado");
		    }
		}
	}

}
