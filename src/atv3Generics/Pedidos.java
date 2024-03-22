package atv3Generics;

import java.util.ArrayList;
import java.util.List;

public class Pedidos extends ProdutoX {
	
	
	List <ProdutoX> prod = new ArrayList<ProdutoX>();	
	
	
	public <T, V> void adicionarProd(T nome, V valor) {
		this.setNome(nome);
		this.setPreco(valor);
		return;
	}
	
	public <T, V> void mostrarLista() {
		
	}

}
