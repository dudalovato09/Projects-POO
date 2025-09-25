package Aula_13;

public class ConversorMoeda {

	static double taxaConversao = 5.0;
	
	public static double converterRealParaDolar (double valorReal) {
		return valorReal / taxaConversao;
	}
	
	public static double converterDolarParaReal (double valorDolar) {
		return valorDolar * taxaConversao;
	}

	public static double getTaxaConversao() {
		return taxaConversao;
	}

	public static void setTaxaConversao(double taxaConversao) {
		ConversorMoeda.taxaConversao = taxaConversao;
	}
}
