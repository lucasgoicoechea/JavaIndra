package es.indra.cursoJava.entidades;

public class Jamon extends CorteCerdo {
	int kg;

	public int getKg() {
		return kg;
	}


	public void setKg(int kg) {
		this.kg = kg;
	}


	public Jamon(String establecimiento, int valor) {
		super(valor, establecimiento);
		
	}
	
	
	public String toString() {
		return "Jamon [Valor=" + valor + ", Vendedor=" + Vendedor + ", peso=" + kg + "]";
	}
}
