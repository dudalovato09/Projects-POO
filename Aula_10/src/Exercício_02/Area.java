package Exercício_02;

public class Area {
	
	public double calcularArea (double raio) {
		return (float) (Math.PI * raio * raio);
	}
	
	public int calcularArea2 (int base, int altura) {
		return base * altura;
	}
	
	public double calcularArea3 (double base, double altura) {
		return (base * altura) / 2;
	}
}
