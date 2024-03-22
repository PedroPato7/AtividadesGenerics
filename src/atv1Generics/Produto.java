package atv1Generics;

public class Produto <T, V>{
	
	private T nome;
	private V preco;

	public Produto(T nome, V preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//Método para imprimir as informações do produto
	public String imprimirInfo() {
		return "Nome: " + nome + "\n" + "Preço: R$ " + preco;
	}
	
//Getters e Setters
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
		builder.append("Produto [nome=");
		builder.append(nome);
		builder.append(", preco=");
		builder.append(preco);
		builder.append("]");
		return builder.toString();
	}
}
