package Exercicio_02;

public class ProdutoNormal extends Produto{

	public ProdutoNormal(float precoUnitario) {
		super(precoUnitario);
	}

	@Override
	public float aplicarDesconto() {
		return getPrecoUnitario() * 0.95f;
	}

}
