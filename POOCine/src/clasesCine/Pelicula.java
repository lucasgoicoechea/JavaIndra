package clasesCine;

public class Pelicula extends Funcion{
	
	protected int añoEstreno;
	protected boolean disponible;
	protected int duracion;
	protected String fechaIngreso;
	protected String nombre;
	protected String tituloOriginal;
	
	
	
	public int calcularDuracion() {
		return duracion;
	}
	public boolean estaDisponible() {
		return disponible;
	}
	public void estaEnCartelera() {}
	public void mostrarFuncionesHabilitadas() {}
	
}
