package ExercIcio_03;

public class Calculadora {

	public static double Somar(double a, double b) {
		return a + b;
	}

	public static double Subtrair(double a, double b) {
		return a - b;
	}

	public static double Dividir(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException("Divisão por zero não é permitida.");
		} else {
			return a / b;
		}
	}

	public static double Multiplicar(double a, double b) {
		return a * b;
	}

	public static double Exponenciação(double base, double expoente) {
		return Math.pow(base, expoente);
	}

	public static double RaizQuadrada(double numero) {
		if (numero < 0) {
			throw new ArithmeticException("Não é possível calcular a raiz quadrada de um número negativo.");
		}
		return Math.sqrt(numero);
	}
}
