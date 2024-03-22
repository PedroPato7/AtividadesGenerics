package atv2Generics;

import java.time.LocalDate;

public class ProdutoMain {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		
		p1.setValor(17.95);
		LocalDate df = LocalDate.parse("2024-03-21"); 
		p1.setDataFabricacao(df);
		LocalDate dv = LocalDate.parse("2024-03-25");
		p1.setDataVencimento(dv);
		
		Produto<String> idStr = new Produto<>();
		idStr.setId("1");
		System.out.println("Cuca de Limão: \n" + p1.getValor() +"\n"
				+ "Id: " + idStr.getId());
		
		
		p1.setValor(6.95);
		df = LocalDate.parse("2024-03-21");
		p1.setDataFabricacao(df);
		dv = LocalDate.parse("2024-04-24"); //Aniversário do Curvello
		p1.setDataVencimento(dv);
		Produto<Integer> idInt = new Produto<>();
		idInt.setId(2);
		System.out.println("Yourgute: \n" + p1.getValor() +"\n"
				+ "Id: " + idInt.getId());

	}

}
