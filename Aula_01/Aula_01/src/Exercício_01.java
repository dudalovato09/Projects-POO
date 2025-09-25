/* Ler dois valores e efetuar os seguintes cálculos: soma, subtração,
multiplicação e divisão dos dois valores. Mostrar todos os resultados. */

import java.util.Scanner; //Importando a biblioteca

public class Exercício_01 {
 
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); // Como se fosse o comando scanf / o nome teclado pode ser qualquer nome
		float valor1, valor2, resultado;
		
		System.out.println("Informe o valor 1: "); // O printf
		valor1 = teclado.nextFloat();
		
		System.out.println("Informe o valor 2: "); 
		valor2 = teclado.nextFloat();
		
		resultado = valor1 + valor2;
		System.out.println("A soma é: " + resultado);
		
		resultado = valor1 - valor2;
		System.out.println("A subtração é: " + resultado);
		
		resultado = valor1 * valor2;
		System.out.println("A multiplicação é: " + resultado);
		
		resultado = valor1 / valor2;
		System.out.println("A divisão é: " + resultado);
		
		teclado.close(); //é para fechar o teclado la em cima do Scanner, porém não faz muito diferença a não ser que o compitador seja muito antigo
	}
}
