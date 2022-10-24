package es.indra.cursoJava.entidades;

public class CorteCerdo {
	
	protected String calidad;
	protected String origen;
	
	
	public CorteCerdo(String calidad, String origen) {
		super();
		this.calidad = calidad;
		this.origen = origen;
	}


	public String getCalidad() {
		return calidad;
	}


	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	@Override
	public String toString() {
		return "calidad=" + calidad + ", origen=" + origen ;
	}
	
	
	
	
	
	

}
