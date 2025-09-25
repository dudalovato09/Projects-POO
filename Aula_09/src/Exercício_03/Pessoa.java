package Exercício_03;

public abstract class Pessoa {
	
	protected String nome;
	protected int idade;
	protected char sexo;
	
	// Metódo toString retorna todos os dados da classe
	public String toString() {
		return "Nome: " + nome + ", Idade: " + idade + ", Sexo: " + sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
