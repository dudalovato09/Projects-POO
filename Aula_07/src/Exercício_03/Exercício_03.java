/* Crie uma classe chamada Livro. A classe deve possuir os atributos para o título, autor e ano de publicação. 
Crie os métodos setters e getters, o método construtor e o método para exibir as informações do livro. 
Crie uma classe Principal que teste os métodos criados. */


package Exercício_03;

public class Exercício_03 {

	public static void main(String[] args) {
		
		Livro livro = new Livro("A Hipótese do Amor", "Ali Hazelwood", 2022);
		
		livro.exibirInforacoes();
		
		livro.setTitulo("Quinze Dias");
		livro.setAutor("Vitor Martins");
		livro.setAno(2017);
		
		System.out.println();
		System.out.println("Após Alterações:");
		System.out.println();
		
		livro.exibirInforacoes();
		
	}
}
