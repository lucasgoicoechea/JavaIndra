package ejcollection;

public class Elemento {
	int numero;
	String nombre;
	
	public Elemento(int numero, String nombre) {
		this.numero = numero;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return numero + " - " + nombre;
	}
	
	
}
