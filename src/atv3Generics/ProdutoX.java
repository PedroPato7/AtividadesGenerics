package atv3Generics;

public class ProdutoX <T, V>{
	
	private T nome;
	private V preco;
	
	public T getNome() {
		return nome;
	}
	public void setNome(T nome) {
		this.nome = nome;
	}
	public V getPreco() {
		return preco;
	}
	public void setPreco(V preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProdutoX [nome=");
		builder.append(nome);
		builder.append(", preco=");
		builder.append(preco);
		builder.append("]");
		return builder.toString();
	}
}
