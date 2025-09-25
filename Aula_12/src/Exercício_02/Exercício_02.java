/*Crie uma classe chamada Figura que seja abstrata, sem nenhum atributo e
que possua os métodos abstratos calculaArea e calculaPerimetro, que retornem,
respectivamente, a área e o perímetro da figura. Após, crie a subclasse
Retangulo que herda de Figura, com os atributos base e altura. Crie também, a
subclasse Circulo que herda de Figura, com o atributo raio.
Lembrando: Para calcular a área de um retângulo multiplicamos a base pela
altura, já para calcular o perímetro de um retângulo, multiplicamos o valor da
base por 2 e somamos com a multiplicação da altura por 2 (base * 2 + altura *
2). Já para calcular a área de um círculo, multiplicamos o valor do PI pelo raio ao
quadrado e para calcularmos o valor do perímetro, utilizamos a fórmula 2 * PI *
raio.
Crie um contador de instâncias (contador de objetos da classe) para a classe
Retangulo e outro contador de instâncias para a classe Circulo. Teste os
contadores na classe Principal.
Crie uma classe Principal para testar os métodos desenvolvidos.*/

package Exercício_02;

public class Exercício_02 {

	public static void main(String[] args) {

		Retangulo reg1 = new Retangulo(2, 3);
		Retangulo reg2 = new Retangulo(1, 9);

		Circulo cir1 = new Circulo(5);

		System.out.println("Retângulo 1 - Área: " + reg1.calculaArea() + ", Perímetro: " + reg1.calculaPerimetro());
		System.out.println("Retângulo 2 - Área: " + reg2.calculaArea() + ", Perímetro: " + reg2.calculaPerimetro());

		System.out.println("Círculo 1 - Área: " + cir1.calculaArea() + ", Perímetro: " + cir1.calculaPerimetro());
		
		System.out.println("\nTotal de retângulos criados: " + Retangulo.getContador());
		System.out.println("Total de círculos criados: " + Circulo.getContador());

	}

}
