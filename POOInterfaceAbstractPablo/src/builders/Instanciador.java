package builders;

import entidades.Arbol;
import entidades.Rama;
import entidades.Tronco;

public class Instanciador {

	public Arbol createArbolGenerico(boolean esRama) {
		Arbol miArbol = null;
		if(esRama) {
			miArbol = new Rama("Roble", 5, false, 1, 0.3);
		}else {
			miArbol = new  Tronco("Roble", 5, false, 1);
		}
		
		return miArbol;
	}
}
