package es.indra.cursoJava.entidades;

public abstract class CorteCerdo {
	double peso;
	
	public double calculaPrecio() {
		return this.peso*3.54;
	}
}
