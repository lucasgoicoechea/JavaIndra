package ejerciciosSet;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		ElementoDeSet elemento1 = new ElementoDeSet(19, "1234A");
		ElementoDeSet elemento2 = new ElementoDeSet(20, "1234E");
		ElementoDeSet elemento3 = new ElementoDeSet(20, "1234U");
		
		Set<ElementoDeSet> miConjunto = new HashSet<>();
		miConjunto.add(elemento1);
		miConjunto.add(elemento2);
		miConjunto.add(elemento3);
		
		for (ElementoDeSet elementoDeSet : miConjunto) {
			System.out.println(elementoDeSet);
		}
	}

}
