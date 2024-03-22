package atv3Generics;

public class MainProd {

	public static void main(String[] args) {
		
		Pedidos<ProdutoX> ped = new Pedidos<>();
		ped.adicionarProd(new Macarrao("Macaro", 7.99));
		ped.adicionarProd(new Esfiha("Esfiha", 24.99));
		
		System.out.println(ped.mostrarLista());

	}

}
