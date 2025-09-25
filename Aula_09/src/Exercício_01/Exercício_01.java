/*Crie uma classe Forma que possua um método abstrato calculaArea(). Na
sequência crie a classe Retangulo e Circulo que herdam de Forma e
sobrescrevem o método calculaArea(). Para calcular a área de um retângulo
multiplica-se a largura pela altura. Já para calcular a área de um círculo deve-se
multiplicar o valor do PI pelo raio ao quadrado. Crie a classe Principal para testar
o código desenvolvido.*/

package Exercício_01;

public class Exercício_01 {

	public static void main(String[] args) {
		
		//Objetos
		Retangulo ret = new Retangulo();
		Circulo cir = new Circulo(); 
		
		ret.setAltura(8);	
		ret.setLargura(6);
		System.out.println("Área do retângulo: " + ret.calculaArea());
		
		cir.setRaio(10);
		System.out.println("Área do circulo: " + cir.calculaArea());
	}

}
