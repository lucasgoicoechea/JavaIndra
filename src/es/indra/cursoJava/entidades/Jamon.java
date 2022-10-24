package es.indra.cursoJava.entidades;

public class Jamon extends CorteCerdo {

	private String nombreDeLaMarca;
	private String bellotas;
	
	
	public Jamon(String nombreDeLaMarca, String bellotas) {
		super();
		this.nombreDeLaMarca = nombreDeLaMarca;
		this.bellotas = bellotas;
	}


	public Jamon() {
		super();
	}


	public Jamon(String nombre, String procedencia, String nombreGranja, double peso, String nombreDeLaMarca, String bellotas) {
		super(nombre, procedencia, nombreGranja, peso);
		this.nombreDeLaMarca = nombreDeLaMarca;
		this.bellotas = bellotas;
	}

	//Gets y sets propios
	public String getNombreDeLaMarca() {
		return nombreDeLaMarca;
	}


	public void setNombreDeLaMarca(String nombreDeLaMarca) {
		this.nombreDeLaMarca = nombreDeLaMarca;
	}


	public String getBellotas() {
		return bellotas;
	}


	public void setBellotas(String bellotas) {
		this.bellotas = bellotas;
	}

	
	//Metodos clase padre
	
	@Override
	public String getNombre() {
		return super.getNombre();
	}


	@Override
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}


	@Override
	public void setProcedencia(String procedencia) {
		super.setProcedencia(procedencia);
	}


	@Override
	public void setNombreGranja(String nombreGranja) {
		super.setNombreGranja(nombreGranja);
	}


	@Override
	public String toString() {
		return super.toString() + ", nombreDeLaMarca=" + nombreDeLaMarca + ", bellotas=" + bellotas + "";
	}
	
	
	
	
	
	
}
