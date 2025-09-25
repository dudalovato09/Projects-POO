/* Suponha que você está criando um sistema de gerenciamento de uma loja
online e precisa implementar as classes "Produto" e "ProdutoDigital".
A classe "Produto" deve ter os atributos "nome", "preco" e
"quantidadeEmEstoque" e um método "calcularPrecoTotal()" que retorna o preço
total do produto (preço multiplicado pela quantidade em estoque).
A classe "ProdutoDigital" é uma subclasse de "Produto" que possui um atributo
adicional "tamanhoDoArquivo" (em megabytes) e sobrescreve o método
"calcularPrecoTotal()" para não levar em conta a quantidade em estoque (já que
produtos digitais não têm limitação de estoque e retorna o preço do produto).
Implemente as classes "Produto" e "ProdutoDigital" com seus respectivos
métodos e atributos, além de um método "main()" que cria instâncias das classes
e testa o método "calcularPrecoTotal()" */

package Exercício_02;

public class Exercício_02 {

	public static void main(String[] args) {
		Produto p = new Produto();
		ProdutoDigital pd = new ProdutoDigital();
		
		p.setNome("Casaco");
		p.setPreco(500);
		p.setQntdEstoque(3);
		System.out.println("O valor total que temos em estoque do " + p.getNome() + " R$" + p.calcularPrecoTotal());
		
		pd.setNome("EBook");
		pd.setPreco(20);
		pd.setTamanhoArquivo(10);
		pd.setQntdEstoque(40);
		System.out.println("O valor total que temos em estoque do " + pd.getNome() + " R$" + pd.calcularPrecoTotal());
	}
}
