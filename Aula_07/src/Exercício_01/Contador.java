/* Escreva em Java uma classe chamada Contador, que encapsule um valor usado para contagem de itens ou eventos. 
 A classe deve oferecer métodos que devem: 
 a) Zerar; 
 b) Incrementar; 
 c) Retornar o valor do contador. */

package Exercício_01;

public class Contador {
	
	private int valor;

	 // Construtor - inicia o contador com valor 0
	public Contador() {
		valor = 0;
	}
	
	
	//Zera o valor 
	public void zerar () {
		valor = 0;
	}

	//Incrementa um valor
	public void incrementar() {
		valor++;
	}


	public int getValor() {
		return valor;
	}
}
