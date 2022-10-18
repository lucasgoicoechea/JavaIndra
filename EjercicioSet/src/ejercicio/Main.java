package ejercicio;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ElementoDeSet elemento1 = new ElementoDeSet(9.99, "K3owlF4z");
		ElementoDeSet elemento2 = new ElementoDeSet(4.99, "M6cfrP9f");
		ElementoDeSet elemento3 = new ElementoDeSet(39.99, "J9prgM1e");
		
		Set<ElementoDeSet> set = new HashSet<>();
		set.add(elemento1);
		set.add(elemento2);
		set.add(elemento3);

		for (ElementoDeSet elementoDeSet : set) {
			elementoDeSet.setOrden(elementoDeSet.hashCode());
			System.out.println(elementoDeSet.toString());

		}
		
	}

}
