package es.indra.cursoJava.entidades;

public class Solomillo extends CorteCerdo{

	private double precio;

	public Solomillo(String calidad, String origen, double precio) {
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
		return "Solomillo [precio=" + precio + super.toString();
	}


	
	
	
}
