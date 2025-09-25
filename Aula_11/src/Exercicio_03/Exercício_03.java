/* Crie uma interface chamada Rendimento que deverá ter a assinatura do
método calculaRendimento. Crie uma classe chamada Poupanca que irá ter o
atributo saldo e terá o rendimento de 6% ao ano. Crie uma classe chamada CDB
que irá ter o atributo saldo e terá o rendimento de 12% ao ano. Crie uma classe
chamada LCI que irá ter o atributo saldo e terá o rendimento de 13% ao ano. As
classes Poupanca, CDB e LCI implementam a interface Rendimento.*/

package Exercicio_03;

public class Exercício_03 {

	public static void main(String[] args) {
		Poupanca p = new Poupanca();
		CDB c = new CDB();
		LCI l = new LCI();
		
		p.setSaldo(1000.0);
		System.out.println("Rendimento na conta Poupança anual R$" + p.calculaRendimento());
		c.setSaldo(1000.0);
		System.out.println("Rendimento na conta CDB anual R$" + c.calculaRendimento());
		l.setSaldo(1000.0);
		System.out.println("Rendimento na conta LCI anual R$" + l.calculaRendimento());
		
	}

}
