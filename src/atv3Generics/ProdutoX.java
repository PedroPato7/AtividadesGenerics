package atv3Generics;

public class ProdutoX{
	
	private String nome;
	private double preco;
	
	public ProdutoX (String nome, double valor) {
		setNome(nome);
		setPreco(valor);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
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
