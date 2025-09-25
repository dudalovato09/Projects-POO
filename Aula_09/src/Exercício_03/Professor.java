package Exercício_03;

public class Professor extends Pessoa {
	
	private int codigo;
	private String disciplina;
	
	// Sobrescrevendo o metodo da classe Pessoa (Classe Mãe)
	@Override
	public String toString() {
		 // super retorna os dados da classe Mãe
		 return super.toString() + ", Código: " + codigo + ", Disciplina: " + disciplina;
	 }
		
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
}
