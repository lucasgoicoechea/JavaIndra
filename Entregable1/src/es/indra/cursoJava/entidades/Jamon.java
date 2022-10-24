package es.indra.cursoJava.entidades;

public class Jamon extends CorteCerdo {
	
	private double precio;
	

	public Jamon(String calidad, String origen, double precio) {
		super(calidad, origen);
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Jamon [precio=" + precio + "]" + super.toString();
	}
	
	

	
	
	


}
