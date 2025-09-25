package Exercicio_03;

public class CDB implements Rendimento{
	
	private double saldo;
	
	@Override
	public double calculaRendimento() {
		return saldo * 0.12;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
