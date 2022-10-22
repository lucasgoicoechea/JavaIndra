package es.indra.cursoJava.entidades;

public class Jamon extends CorteCerdo {
	
	int peso;
	int precio;
	
	//Constructor 
	
	public Jamon(String nombreTienda, int calidad, int peso, int precio) {
		super(nombreTienda, calidad);
		
		this.peso = peso;
		this.precio = precio;
	}
	
	//getters and setters
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	//Metodo
	
	public void esCaro() {
		if(precio < 10) {
			System.out.println("Es barato");
		}
		System.out.println("Es caro");
	}
	
	//metodo-padre
	
	@Override
	public void esDeCalidad() {
		// TODO Auto-generated method stub
		super.esDeCalidad();
	}

	//toString
	
	@Override
	public String toString() {
		return "Jamon [peso=" + peso + ", precio=" + precio + ", nombreTienda=" + nombreTienda + ", calidad=" + calidad
				+ "]";
	}
	
	

}
