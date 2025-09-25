package Exercício_03;

public class Aluno extends Pessoa{
	private int matricula;
	private String curso;
	
	
	// Metódo toString retorna todos os dados da classe
	 @Override
    public String toString() {
		 // super retorna os dados da classe Mãe
		 return super.toString() + ", Matrícula: " + matricula + ", Curso: " + curso;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}
