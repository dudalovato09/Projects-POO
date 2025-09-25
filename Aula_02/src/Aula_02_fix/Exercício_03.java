/*Efetuar o cálculo da quantidade de litros de combustível gastos em uma viagem, 
utilizando-se um automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário 
deverá fornecer o tempo gasto e a velocidade média durante a viagem. Desta forma, 
será possível obter a distância percorrida com a fórmula 

DISTÂNCIA = TEMPO * VELOCIDADE. 

Tendo o valor da distância, basta calcular a quantidade de litros de combustível 
utilizada na viagem com a fórmula: 

LITROS_USADOS = DISTÂNCIA / 12. 

O programa deverá apresentar os valores da velocidade média, tempo gasto, a distância 
percorrida e a quantidade de litros utilizados na viagem. */

package Aula_02_fix;

import java.util.Scanner;

public class Exercício_03 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		double distancia, tempo, velocidade, litros;
		
		System.out.println("Digite o tempo gasto nessa viagem em horas: ");
		tempo = scan.nextDouble();
		
		System.out.println("Digite a velocidade média durante a viagem (km/h): ");
		velocidade = scan.nextDouble();
		
		distancia = tempo * velocidade;
		
		litros = distancia / 12;
		
		System.out.println("A velocidade média foi de: " + velocidade + " km/h");
		System.out.println("O tempo gasto foi de: " + tempo + " horas");
		System.out.println("A distância percorrida foi de: " + distancia + " km");
		System.out.println("Litros utilizados: " + litros + " litros");
		
		
		
		scan.close();
	}

}
