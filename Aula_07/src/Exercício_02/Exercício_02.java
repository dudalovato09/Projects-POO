/* Crie uma classe chamada Carro. A classe deve possuir os atributos modelo, cor e velocidade. 
Crie os métodos setters e getters, o método construtor, o método acelerar que recebe por parâmetro 
um número inteiro referente ao valor que deve ser incrementado no valor do atributo velocidade e o 
método para reduzir velocidade que deve receber por parâmetro um valor inteiro referente ao valor 
que deve ser decrementado no valor do atributo velocidade. Crie uma classe Principal que teste os métodos criados.*/

package Exercício_02;

import java.util.Scanner;

public class Exercício_02 {

	public static void main(String[] args) {
		Carro fastCar = new Carro ();
	
		int velocidade;
		Scanner scan = new Scanner(System.in);
		
		fastCar.setModel("Civic");
		fastCar.setColor("Vermelho");
		fastCar.setSpeed(125);
		
		System.out.println("Modelo do carro: " + fastCar.getModel());
		System.out.println("Cor do carro: " + fastCar.getColor());
		System.out.println("Velocidade do carro: " + fastCar.getSpeed());
		
		System.out.println("Aumentar:");
		velocidade = scan.nextInt();
		
		fastCar.acelerar(velocidade);
		System.out.println("Velocidade do carro: " + fastCar.getSpeed());
		
		System.out.println("Diminuir:");
		velocidade = scan.nextInt();
		
		fastCar.reduzir(velocidade);
		System.out.println("Velocidade do carro: " + fastCar.getSpeed());
	}
}
