package Exercicio_03;

public class Principal {

	public static void main(String[] args) {
		
		Produto p = new Produto (1, 5.0f);
	
		System.out.println("Código do Produto: " + p.getCodigo());
		System.out.println("Preço de Venda do Produto: R$" + p.getPrecoVenda());
		
		
	}
}
