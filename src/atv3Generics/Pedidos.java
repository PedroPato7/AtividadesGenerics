package atv3Generics;

import java.util.ArrayList;
import java.util.List;

public class Pedidos <T extends ProdutoX>   {
	
	
	List <T> prod = new ArrayList<>();	
	
	
	public void adicionarProd(T food) {
		prod.add(food);
	}
	
	public List<T> mostrarLista() {
		return prod;
	}

}
