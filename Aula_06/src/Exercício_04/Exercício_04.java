package Exercício_04;



public class Exercício_04 {

	public static void main(String[] args) {
		
		ContaBancaria banco = new ContaBancaria ();
		
		banco.setNomeProprietario("Bruno Golin");
		banco.setNumeroAgencia(1143);
		banco.setNumeroConta (123);
		banco.setSaldo(55890);
		
		System.out.println("Saldo: " + banco.getSaldo());
		
		banco.depositar(200);
		System.out.println("Saldo: " + banco.getSaldo());
		
		banco.sacar(200);
		System.out.println("Saldo: " + banco.getSaldo());
		
		banco.depositar(110);
		System.out.println("Saldo: " + banco.getSaldo());
	}

}
