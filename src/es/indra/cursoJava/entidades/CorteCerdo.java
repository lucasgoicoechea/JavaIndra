package es.indra.cursoJava.entidades;

public class CorteCerdo {
	
	private String nombre;
	private String procedencia;
	private String nombreGranja;
	private double peso;
	
	
	public CorteCerdo() {
		
	}
	
	public CorteCerdo(String nombre, String procedencia, String nombreGranja, double peso) {
		super();
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.nombreGranja = nombreGranja;
		this.peso = peso;
		
	}
	
	
	//Gets y sets
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public String getNombreGranja() {
		return nombreGranja;
	}
	public void setNombreGranja(String nombreGranja) {
		this.nombreGranja = nombreGranja;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
	@Override
	public String toString() {
		return "Nombre=" + nombre + ", procedencia=" + procedencia + ", nombreGranja=" + nombreGranja
				+ ", peso=" + peso + "";
	}
	
	

}
