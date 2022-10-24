package es.indra.cursoJava.entidades;

public class Solomillo extends CorteCerdo {
	
	int peso;

	public Solomillo(String establecimiento, int valor) {
		super(valor, establecimiento);
		
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "Solomillo [Valor=" + valor + ", establecimiento=" + establecimiento + ", peso=" + peso + "]";
	}

}