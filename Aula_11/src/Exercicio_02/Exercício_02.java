/* Crie uma interface chamada Imprimir que deverá ter a assinatura do método
imprimeDados. Crie uma classe chamada Pessoa com os atributos para o nome,
telefone e e-mail, crie os métodos getters e setters e implemente a interface
Imprimir.*/

package Exercicio_02;

public class Exercício_02 {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa ();
		p.setNome("Eduarda chata");
		p.setTelefone("(54) 99620-7640");
		p.setEmail("eduarda.lovato@gmail.com.br");
		p.imprimeDados();
	}
}
