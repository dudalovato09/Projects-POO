/*Crie uma classe chamada Calcular que deverá ter um método chamado somar
que irá receber por parâmetro dois valores inteiros e deverá realizar a soma dos
dois valores.
Terá um segundo método chamado somar que irá receber três valores inteiros
por parâmetro e deverá realizar a soma dos três valores.
Crie um terceiro método chamado somar também, que receberá dois parâmetros
do tipo float e realizará a soma dos valores e um quatro método com o nome
somar que receberá por parâmetro três valores do tipo float e realizará a soma
dos valores.
Crie uma classe Principal para testar os métodos criados.
*/

package Exercício_01;

public class Exercício_01 {

	public static void main(String[] args) {

		Calcular calc = new Calcular();

		// Testando somas com inteiros
		System.out.println("Soma de 2 inteiros (3 + 5): " + calc.somar(3, 5));
		System.out.println("Soma de 3 inteiros (1 + 2 + 3): " + calc.somar2(1, 2, 3));

		// Testando somas com floats
		System.out.println("Soma de 2 floats (2.5 + 3.5): " + calc.somar3(2.5f, 3.5f));
		System.out.println("Soma de 3 floats (1.1 + 2.2 + 3.3): " + calc.somar4(1.1f, 2.2f, 3.3f));
	}

}
