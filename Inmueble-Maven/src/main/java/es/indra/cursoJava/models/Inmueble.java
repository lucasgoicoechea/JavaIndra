package es.indra.cursoJava.models;

import es.indra.cursoJava.interfaces.IInmueble;

public class Inmueble implements IInmueble{
	
	protected Inventario inventario;
	protected String direccion;
	
	//constructor
	public Inmueble(Inventario inventario, String direccion) {
		super();
		this.inventario = inventario;
		this.direccion = direccion;
	}

	//Getters y setters
	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	//toString
	@Override
	public String toString() {
		return "Inmueble [inventario=" + inventario + ", direccion=" + direccion + "]";
	}
	

	
	
	
}
