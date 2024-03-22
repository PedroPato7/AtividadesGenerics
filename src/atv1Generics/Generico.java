package atv1Generics;

public class Generico<T> {
	
	private T tributo;

	public T getTributo() {
		return tributo;
	}

	public void setTributo(T tributo) {
		this.tributo = tributo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Generico [tributo=");
		builder.append(tributo);
		builder.append("]");
		return builder.toString();
	}
	
	

}
