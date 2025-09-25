/*Crie uma classe chamada “Area” que possua três métodos com o nome de
“calcularArea” que são especificados a seguir.
Crie um método chamado “calcularArea” que receba um parâmetro double: raio.
Este método deve retornar a área de um círculo, que pode ser calculada como:
PI * raio * raio.
Crie um método chamado “calcularArea” que receba dois parâmetros inteiros:
base e altura. Este método deve retornar a área da superfície de um retângulo,
que pode ser calculada como: base * altura.
Crie um método chamado “calcularArea” que receba dois parâmetros double:
base e altura. Este método deve retornar a área de um triângulo, que pode ser
calculada como: (base * altura) / 2.
Crie uma classe Principal para testar os métodos criados.*/

package Exercício_02;

public class Exercício_02 {

	public static void main(String[] args) {
		Area area = new Area ();
		
		System.out.println("Aréa de um círculo: " + area.calcularArea(4.0));
		System.out.println("Superfície de um retângulo: " + area.calcularArea2(2,4));
		System.out.println("Aréa de um triângulo:" + area.calcularArea3(2.0, 5.0 ));
		
	}
}
