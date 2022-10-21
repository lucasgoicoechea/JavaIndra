package es.indra.cursoJava.entidades;

public class CorteCerdo {
	
	protected int precio;
	protected String carniceria;

	public static void main(String[] args) {
		//Pedido
	}

	public CorteCerdo(int precio, String carniceria) {
		this.precio = precio;
		this.carniceria = carniceria;
	}
	

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getCarniceria() {
		return carniceria;
	}

	public void setCarniceria(String carniceria) {
		this.carniceria = carniceria;
	}
	
	
}
