package es.indra.cursoJava.models;

import es.indra.cursoJava.interfaces.IInmueble;

public class Inmueble implements IInmueble{
	protected Inventario inventario;
	protected String direccion;

	public String getDireccion() {
		return this.direccion;
	}

	public Inventario getInventario() {
		// TODO Auto-generated method stub
		return this.inventario;
	}
}
