package Exercicio_02;

public class Principal {

	public static void main(String[] args) {

		ProdutoNormal pn = new ProdutoNormal(200f);
		
		System.out.println("Valor Unitário do Produto Normal com desconto aplicado: R$" + pn.aplicarDesconto());
		
		ProdutoEspecial pe = new ProdutoEspecial(200f);
		
		System.out.println("Valor Unitário do Produto Especial com desconto aplicado: R$" + pe.aplicarDesconto());

	}
}
