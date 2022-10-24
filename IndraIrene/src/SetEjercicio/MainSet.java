package SetEjercicio;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
	
	public static void main(String[] args) {
		ElementoSet elemento1 = new ElementoSet(19, "1234A");
		ElementoSet elemento2 = new ElementoSet(20, "1234E");
		ElementoSet elemento3 = new ElementoSet(20, "1234U");
		
		Set<ElementoSet> miConjunto = new HashSet<>();
		miConjunto.add(elemento1);
		miConjunto.add(elemento2);
		miConjunto.add(elemento3);
		
		for (ElementoSet elementoSet : miConjunto) {
			System.out.println(elementoSet);
		}
	}

}
