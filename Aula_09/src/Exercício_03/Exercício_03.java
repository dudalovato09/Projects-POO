package Exercício_03;

public class Exercício_03 {

	public static void main(String[] args) {
		Aluno alu = new Aluno();
		Professor pro = new Professor();
		
		//Settando dados para classe Aluno
		alu.setNome("Eduarda");
		alu.setIdade(18);
		alu.setSexo('F');
		alu.setMatricula(124124);
		alu.setCurso("ADS");
		
		// Teste do metodo
		System.out.println("Dados: " + alu.toString());
		
		// Settando dados para classe Professor
		pro.setNome("Jason");
		pro.setIdade(30);
		pro.setSexo('M');
		pro.setCodigo(123);
		pro.setDisciplina("T.I");
		
		// Teste do metodo
		System.out.println("Dados: " + pro.toString());
	}
}
