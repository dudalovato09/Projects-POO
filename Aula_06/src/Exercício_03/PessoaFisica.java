package Exercício_03;

public class PessoaFisica {
	
	private String nome;
	private String cpf;
	private String rg;
	private int idade;
	private String endereco;
	private String telefone;
	
	//Criação de objeto
	public PessoaFisica()
	{
		nome = "";
		cpf = "";
		idade = 0;
		rg = "";
		endereco = "";
		telefone = "";
	}
	
	//Classe principal
	public PessoaFisica(String nome, String cpf, String rg, int idade, String endereco, String telefone)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
}
