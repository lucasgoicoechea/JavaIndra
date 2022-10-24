package es.indra.cursoJava.entidades;

public class Jamon extends CorteCerdo {
	
	int peso;

	public Jamon(String establecimiento, int valor) {
		super(valor, establecimiento);
		
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "Jamon [Valor=" + valor + ", establecimiento=" + establecimiento + ", peso=" + peso + "]";
	}

}
