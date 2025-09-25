package Exercício_02;

public class Exercício_02 {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario ();
		
		//
		f.setNome("Eduarda");
		f.setDepartamento("TI");
		f.setSalario(1200);
		System.out.println("Nome: " + f.getNome());
		System.out.println("Departamento: " + f.getDepartamento());
		System.out.println("Salário: " + f.getSalario());
		
		f.recebeAumento(500);
		
		System.out.println("Novo Salário: " + f.getSalario());
		System.out.println("Ganho anual: " + f.calculoGanhoAtual());
	}
}
