package Exercício_01;

public class Animal {
	
	// Atributos
	private String nome;
	private float comprimento;
	private String cor;
	private String ambiente;
	private float velocidade_media;
	
	//Inicializacao
	public Animal(){
		this.nome = "";
		this.comprimento = 0;
		this.cor = "";
		this.ambiente = "";
		this.velocidade_media = 0;
	}
	
	//Construtor
	public Animal (String nome, float comprimento, String cor, String ambiente, float velocidade_media) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade_media = velocidade_media;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public float getVelocidade_media() {
		return velocidade_media;
	}
	public void setVelocidade_media(float velocidade_media) {
		this.velocidade_media = velocidade_media;
	}
	
	// Método Dados
	public void  Dados () {
		System.out.println("--- RELATÓRIO DO ANIMAL ---");
		System.out.println("Nome: " + this.nome);
		System.out.println("Comprimento: " + this.comprimento + " metros");
		System.out.println("Cor: " + this.cor);
		System.out.println("Ambiente: " + this.ambiente);
		System.out.println("Velocidade média: " + this.velocidade_media + " km/h");
	}
}
