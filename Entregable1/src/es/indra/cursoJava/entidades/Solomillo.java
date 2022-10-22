package es.indra.cursoJava.entidades;

public class Solomillo extends CorteCerdo {
	
	int precio;

	public Solomillo(String nombreTienda, int calidad, int precio) {
		super(nombreTienda, calidad);
		this.precio = precio;
		
	}
	//getters y setters

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	//metodo
	
	public void esCaro() {
		if(precio < 10) {
			System.out.println("Es barato");
		}
		System.out.println("Es caro");
	}
	
	//metodo padre

	@Override
	public void esDeCalidad() {
		// TODO Auto-generated method stub
		super.esDeCalidad();
	}

	
	//toString
	
	@Override
	public String toString() {
		return "Solomillo [precio=" + precio + ", nombreTienda=" + nombreTienda + ", calidad=" + calidad + "]";
	}
	
}

