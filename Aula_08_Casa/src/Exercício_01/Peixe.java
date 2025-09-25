package Exercício_01;

// Extends significa que essa classe receberá atributos e métodos de outra classe, nesse caso da classe animal
public class Peixe extends Animal {
	
	// Atributo exclusivo da classe peixe
	private String caracteristica;
	
	// Inicializacao
	public Peixe() {
		this.caracteristica = "";
	}
	
	//Construtor
	public Peixe(String nome, float comprimento, String cor, String ambiente, float velocidade_media) {
		super(nome, comprimento, cor, ambiente, velocidade_media); // chama o construtor da classe Animal
		this.caracteristica = caracteristica;
	}
	
	//Getters and Setters
	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}	
	
	public void DadosPeixe() {
		super.Dados(); // chama o método da classe Animal
		System.out.println("Característica: " + this.caracteristica);
	}
}
