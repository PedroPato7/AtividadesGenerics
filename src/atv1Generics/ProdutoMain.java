package atv1Generics;

public class ProdutoMain {

	public static void main(String[] args) {

		Generico<Produto> produto1 = new Generico<>();
		produto1.setTributo(new Produto("Pamonha", 56.88));
		System.out.println("Produto 1:");
		System.out.println(produto1.getTributo().imprimirInfo());
		
		Generico<String> gender = new Generico<>();
		gender.setTributo("Paçoca, R$ 20,00 pila leva 40");
		System.out.println("\nProduto 2:");
		System.out.println(gender.getTributo());
		
		Generico<Double> arthur = new Generico<>();	
		arthur.setTributo(203.70);
		System.out.println("\nProduto 3:");
		System.out.println("Nome: Chapéu De Couro - Modelo Arthur Morgan E John Marston - LARGADÃO - COURO E LONA \n "
				+ "Preço: " + arthur.getTributo());
	}

}
