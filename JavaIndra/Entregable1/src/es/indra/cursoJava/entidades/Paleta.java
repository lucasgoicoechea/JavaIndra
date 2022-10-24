package es.indra.cursoJava.entidades;

public class Paleta extends CorteCerdo{
	int kg;

	public int getKg() {
		return kg;
	}



	public void setKg(int kg) {
		this.kg = kg;
	}



	public Paleta(String establecimiento, int valor) {
		super(valor, establecimiento);
		
	}
	

	
	public String toString() {
		return "Paleta [Valor=" + valor + ", Vendedor=" + Vendedor + ", peso=" + kg + "]";
	}
}
