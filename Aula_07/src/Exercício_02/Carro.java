/* Crie uma classe chamada Carro. A classe deve possuir os atributos modelo, cor e velocidade. 
Crie os métodos setters e getters, o método construtor, o método acelerar que recebe por parâmetro 
um número inteiro referente ao valor que deve ser incrementado no valor do atributo velocidade e o 
método para reduzir velocidade que deve receber por parâmetro um valor inteiro referente ao valor 
que deve ser decrementado no valor do atributo velocidade. Crie uma classe Principal que teste os métodos criados.*/

package Exercício_02;

public class Carro {

	private String model;
	private String color;
	private int speed;
	
	//Método construtor 
	
	public Carro() {
		model = "";
		color = "";
		speed = 0;
	}
	
	//Classe Principal
	public Carro (String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
	//Getters e Setters
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void acelerar(int aceleracao) {
		this.speed += aceleracao;
	}
	
	public void reduzir(int reducao) {
		this.speed -= reducao;
	}
	
	
	
	
	
	
	
}
