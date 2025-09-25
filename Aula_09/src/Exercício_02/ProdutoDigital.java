package Exercício_02;

public class ProdutoDigital extends Produto{

	private float tamanhoArquivo;
	
	 @Override
	    public float calcularPrecoTotal() {
	        return preco;
	    }

	public float getTamanhoArquivo() {
		return tamanhoArquivo;
	}

	public void setTamanhoArquivo(float tamanhoArquivo) {
		this.tamanhoArquivo = tamanhoArquivo;
	}
	
}
