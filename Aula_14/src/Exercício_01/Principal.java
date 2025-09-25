/*Você está desenvolvendo um sistema de gerenciamento de funcionários para
uma empresa. Cada funcionário tem um nome, um salário e um método
chamado "calcularBonus()". No entanto, você deseja que a classe "Funcionario"
seja uma classe base que não possa ser estendida. Além disso, você quer
garantir que o método "calcularBonus()" não possa ser sobrescrito por classes
derivadas.
O método "calcularBonus()" sempre retornará 10% do salário do funcionário.
Crie uma classe chamada "Principal" com um método "main()" que realiza as
seguintes tarefas: crie um objeto da classe "Funcionario" com um nome e salário
de sua escolha, imprima o nome e o salário do funcionário. Após chame o
método "calcularBonus()" para calcular e imprimir o bônus do funcionário.
Certifique-se de criar os getters e setters necessários para acessar os atributos
da classe "Funcionario".*/

package Exercício_01;

public class Principal {

	public static void main(String[] args) {
		Funcionario func = new Funcionario ();
		
		func.setNome("Eduarda");
		func.setSalario(1200);
		
		System.out.println("Nome do funcionário: " + func.getNome());
		System.out.println("Salário do funcionário R$" + func.getSalario());
		System.out.println("Calculo do bônus: " + func.calcularBonus());
		
	}
}
