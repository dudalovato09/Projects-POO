package Exercício_01;

public final class Funcionario {

	private String Nome;
	private double salario;
	
	public final double calcularBonus() {
		return salario * 0.10;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
