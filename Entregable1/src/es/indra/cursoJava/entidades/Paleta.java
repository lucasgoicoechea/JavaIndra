package es.indra.cursoJava.entidades;

public class Paleta extends CorteCerdo{
	
	private double precio;

	public Paleta(String calidad, String origen, double precio) {
		super(calidad, origen);
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Paleta [precio=" + precio + super.toString();
	}

	

}
