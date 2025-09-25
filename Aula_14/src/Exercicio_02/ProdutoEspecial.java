package Exercicio_02;

public class ProdutoEspecial extends Produto {

	public ProdutoEspecial(float precoUnitario) {
		super(precoUnitario);
	}

	@Override
	public final float aplicarDesconto() {
		return getPrecoUnitario() - 50f;
	}

}
