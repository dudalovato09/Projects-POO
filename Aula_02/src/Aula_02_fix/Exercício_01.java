/*Imagine uma república que tenha como base os seguintes impostos para seus contribuintes 
assalariados.  
• Desconta-se se inicialmente 10% do salário bruto do trabalhador como 
contribuição da previdência social. Após este desconto existe outro de 30% sobre o valor 
restante, a título de imposto de renda.
• Crie um software para ler o salário bruto de um infeliz cidadão e imprima o seu salário líquido */

package Aula_02_fix;

import java.util.Scanner;

public class Exercício_01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double bruto, descontoPrev, brutoPrev, descontoImp, liquido;
		
		System.out.println("Digite o salário bruto: ");
		bruto = scan.nextDouble();
		
		descontoPrev = bruto * 0.10;
		brutoPrev = bruto - descontoPrev;
		descontoImp = brutoPrev * 0.30;
		liquido = brutoPrev - descontoImp;
		
		
		System.out.println("Salário Bruto: R$ " + bruto);
		System.out.println("Desconto Previdência (10%): R$ " + descontoPrev);
		System.out.println("Salário Bruto pós desconto: R$ " + brutoPrev);
		System.out.println("Desconto Imposto de Renda: R$ " + descontoImp);
		System.out.println("Salário Líquido: R$ " + liquido);
		
		scan.close();
	}

}
