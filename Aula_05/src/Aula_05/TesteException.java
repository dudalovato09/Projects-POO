/*Escreva um programa que leia uma frase e gere uma exceção caso não
contenha a palavra “teste” na frase digitada.*/

package Aula_05;

public class TesteException extends Exception { // classe para forçar o software a gerar uma exceção

	@Override
	public String getMessage() {
		return "Não existe a palavra teste em sua frase";
	}

}
