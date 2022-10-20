package Controlador;

import java.util.LinkedHashSet;
import java.util.Set;

import Modelo.ElementoDeSet;

public class MainSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ElementoDeSet aux1 = new ElementoDeSet(45, "aux1");
		aux1.setOrden(1);
		ElementoDeSet aux2 = new ElementoDeSet(45, "aux2");
		
		aux2.setOrden(2);

		Set<ElementoDeSet> conjunto = new LinkedHashSet<>();
		conjunto.add(aux1);
		conjunto.add(aux2);

		for (ElementoDeSet aux : conjunto) {
			System.out.println(aux.toString());
		}
		
		

	}

}
