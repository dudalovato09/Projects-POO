package Exercício_02;

public class Funcionario {
	
	private String nome;
	private String departamento;
	private float salario;
	private String RG;
	private String data_admissao;
	
	//Definir o nome passado pelo parâmetro entre ()
	public void setNome(String nome) {
		//this é usado para indicar que é o atributo e não o parâmetro
		this.nome = nome;
	}
	
	//Retornar o nome
	public String getNome() {
		return nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(String data_admissao) {
		this.data_admissao = data_admissao;
	}
	
	public void recebeAumento(float aumento)
	{
		salario += aumento;
	}
	
	public float calculoGanhoAtual () 
	{
		return salario * 12;
	}
}
