package Exercício_03;

public class Exercício_03 {

	public static void main(String[] args) {

		PessoaFisica p = new PessoaFisica (
				"Bruno Golin Ferreira",
				"666.666.666-66",
				"666",
				87,
				"Rua",
				"(54) 12345-6789"
				);
		System.out.println("Nome: " + p.getNome());
		System.out.println("CPF: " + p.getCpf());
		System.out.println("RG: " + p.getRg());
		System.out.println("Idade: " + p.getIdade());
		System.out.println("Emdereço: " + p.getEndereco());
		System.out.println("Telefone: " + p.getTelefone());
	}

}
