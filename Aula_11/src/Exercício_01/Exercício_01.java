/*Crie uma interface que possua a assinatura do método calculaPerimetro. Crie
uma classe chamada Quadrado e uma classe chamada Retangulo que irão
implementar a interface.
Lembrando: para calcular o perímetro de um quadrado basta multiplicar por 4 o
valor do lado. Já para calcular o perímetro de um retângulo utilize a fórmula -
base * 2 + altura * 2. Crie uma classe Principal para testar os métodos
desenvolvidos*/

package Exercício_01;

public class Exercício_01 {

	public static void main(String[] args) {
		
		Quadrado q = new Quadrado();
		q.setLado(5);
		System.out.println(q.calculaPerimetro());
		
		Retangulo r = new Retangulo();
		r.setBase(4);
		r.setAltura(6);
		System.out.println(r.calculaPerimetro());
	}

}
