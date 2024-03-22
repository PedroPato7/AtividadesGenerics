package atv4Generics;

public class ChaveValue <T> {

	private String chave;
	private T valor;
	
	public ChaveValue(String chav, T val) {
		setValor(val);
		setChave(chav);
	}
	
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public T getValor() {
		return valor;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChaveValue [chave=");
		builder.append(chave);
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}
	
}
