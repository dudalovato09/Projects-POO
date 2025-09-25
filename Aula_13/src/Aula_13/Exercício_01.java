package Aula_13;

import java.util.Scanner;

public class Exercício_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		double valor;
		
		System.out.println("Digite valor em Real para converter para Dólar.R$");
		valor = input.nextDouble();
		System.out.println("R$" + valor + " convertido em Dólar $" + ConversorMoeda.converterRealParaDolar(valor));
	
		System.out.println(" ");
		
		System.out.println("Digite valor em Dólar para converter para Real.$");
		valor = input.nextDouble();
		System.out.println("$" + valor + " convertido em Real R$" + ConversorMoeda.converterDolarParaReal(valor));
		
	}
}
