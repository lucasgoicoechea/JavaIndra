package es.indra.cursoJava.entidades;

public class Solomillo extends CorteCerdo {
	
	int kg;

	public int getKg() {
		return kg;
	}



	public void setKg(int kg) {
		this.kg = kg;
	}



	public Solomillo(String establecimiento, int valor) {
		super(valor, establecimiento);
		
	}
	

	
	public String toString() {
		return "Solomillo [Valor=" + valor + ", vendedor=" + Vendedor + ", peso=" + kg + "]";
	}

}
