/* Crie uma classe chamada Livro. A classe deve possuir os atributos para o título, autor e ano de publicação. 
Crie os métodos setters e getters, o método construtor e o método para exibir as informações do livro. 
Crie uma classe Principal que teste os métodos criados. */

package Exercício_03;

public class Livro {
	
	private String titulo;
	private String autor;
	private int ano;
	
	//Método Construtor
	public Livro()
	{
		titulo = "";
		autor = "";
		ano = 0;
	}
	
	//Classe principal
	public Livro(String titulo, String autor, int ano)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void exibirInforacoes() {
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ano: " + ano);
	}
	
	
}
