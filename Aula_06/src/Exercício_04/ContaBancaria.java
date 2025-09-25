package Exercício_04;

public class ContaBancaria {

	private String nomeProprietario;
	private int numeroAgencia;
	private int numeroConta;
	private float saldo;
	
	//Criação de objeto
		public ContaBancaria()
		{
			nomeProprietario = "";
			numeroAgencia = 0;
			numeroConta = 0;
			saldo = 0;
		}
		
		//Classe principal
		public ContaBancaria(String nomeProprietario, int numeroAgencia, int numeroConta, float saldo)
		{
			this.nomeProprietario = nomeProprietario;
			this.numeroAgencia = numeroAgencia;
			this.numeroConta = numeroConta;
			this.saldo = saldo;
		}
		
	//Getters e Setters
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void depositar (float valor) {
		saldo += valor;
	}
	
	public void sacar (float valor) {
		if (saldo >= valor)
		saldo -= valor;
	}
}
