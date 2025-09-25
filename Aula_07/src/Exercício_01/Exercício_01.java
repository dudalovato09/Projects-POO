/* Escreva em Java uma classe chamada Contador, que encapsule um valor usado para contagem de itens ou eventos. 
 A classe deve oferecer métodos que devem: 
 a) Zerar; 
 b) Incrementar; 
 c) Retornar o valor do contador. */

package Exercício_01;

public class Exercício_01 {

	public static void main(String[] args) {
		
		Contador c = new Contador();
		
		c.incrementar();
		c.incrementar();
		System.out.println("O valor atual é: " + c.getValor());
		
		c.zerar();
		System.out.println("O valor atual é: " + c.getValor());

	}
}
