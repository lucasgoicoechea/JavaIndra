package ejcollection;

import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		List<Elemento> miListaDeElementos = new ArrayList<>();
		
		Elemento elemento1 = new Elemento(1, "elemento 1");
		Elemento elemento2 = new Elemento(2, "elemento 2");
		Elemento elemento3 = new Elemento(3, "elemento 3");
		miListaDeElementos.add(elemento1);
		miListaDeElementos.add(elemento2);
		miListaDeElementos.add(elemento3);
		
		for(Elemento elemento : miListaDeElementos) {
			System.out.println(elemento);
		}
	}
}
