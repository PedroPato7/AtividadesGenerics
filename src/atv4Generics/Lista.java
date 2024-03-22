package atv4Generics;

import java.util.ArrayList;
import java.util.List;

public class Lista <T> {
	
	private List<ChaveValue <T>> cv = new ArrayList<>();

	public boolean addLista(ChaveValue <T> obj) {
		for (int x = 0; x < cv.size(); x++) {
			if (cv.get(x).getChave().equals(obj.getChave())) {
				return false;
			}
		}
		cv.add(obj);
		return true;
	}
	
}
