package Exercicio_02;

public class Pessoa implements Imprimir {
	
	private String nome;
	private String telefone;
	private String email;
	
	@Override
	public void imprimeDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("E-mail: " + this.email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
