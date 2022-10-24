package es.indra.cursoJava.entidades;

public class Paleta extends CorteCerdo {
	
	int peso;

	public Paleta(String establecimiento, int valor) {
		super(valor, establecimiento);
		
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "Paleta [Valor=" + valor + ", establecimiento=" + establecimiento + ", peso=" + peso + "]";
	}

}

