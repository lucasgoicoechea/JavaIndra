package es.indra.cursoJava.models;

public class Inventario {

	protected int numeroInmuebles;

	//constructor
	public Inventario(int numeroInmuebles) {
		this.numeroInmuebles = numeroInmuebles;
	}

	//getter y setter
	public int getNumeroInmuebles() {
		return numeroInmuebles;
	}

	public void setNumeroInmuebles(int numeroInmuebles) {
		this.numeroInmuebles = numeroInmuebles;
	}

	//toString
	@Override
	public String toString() {
		return "Inventario [numeroInmuebles=" + numeroInmuebles + "]";
	}
	
	
}
