package es.indra.cursoJava.models;

public class Inventario {
	
	protected String nombre;
	protected String origen;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public Inventario(String nombre, String origen) {
		super();
		this.nombre = nombre;
		this.origen = origen;
	}
	@Override
	public String toString() {
		return "nombre=" + nombre + ", origen=" + origen + "]";
	}
	
	
	

}
