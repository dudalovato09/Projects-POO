package Exercício_01;

public class Exercício_01 {

	public static void main(String[] args) {
		
		// Cria o objeto da classe Animal
		Animal animal = new Animal();
		
		// Settando dados para o nosso objeto
		animal.setNome("Cobra");
		animal.setComprimento(2);
		animal.setCor("Verde");
		animal.setAmbiente("Floresta");
		animal.setVelocidade_media(29);
		
		// Chama o méetodo para imprimir os dados do nosso animal
		animal.Dados();
		
		
		//Apenas para pular uma linha no console
		System.out.println(" ");
		
		
		//Cria o objeto da classe Peixe
		Peixe peixe = new Peixe ();
		
		//Settaremos apenas a caracteristica.. o restante dos dados deve ficar como foi inicializado na classe Peixe mesmo
		peixe.setCaracteristica("Aquático");
		
		// Chama o método para imprimir os dados do peixe (Igual ao do animal, mas com a add da caracteristica)
		peixe.DadosPeixe();
	}
}
