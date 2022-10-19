package ejset;

import java.util.HashSet;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		int orden = 1;
		ElementoSet elemento1 = new ElementoSet(10.5, "123456");
		ElementoSet elemento2 = new ElementoSet(11.5, "1234567");
		ElementoSet elemento3 = new ElementoSet(12.5, "12345678");
		
		Set<ElementoSet> miConjunto = new HashSet();
		miConjunto.add(elemento1);
		miConjunto.add(elemento2);
		miConjunto.add(elemento3);
		
		for (ElementoSet elementoSet : miConjunto) {
			elementoSet.setOrden(orden);
			System.out.println(elementoSet.toString());
			orden++;
		}
	}
}
