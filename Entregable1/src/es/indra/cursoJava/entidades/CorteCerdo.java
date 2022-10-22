package es.indra.cursoJava.entidades;

public class CorteCerdo {

	String nombreTienda;
	int calidad;
	
	//Constructor
	
	public CorteCerdo(String nombreTienda, int calidad) {
		this.nombreTienda = nombreTienda;
		this.calidad = calidad;
	}
	
	//Getters y Setters

	public String getNombreTienda() {
		return nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public int getCalidad() {
		return calidad;
	}

	public void setCalidad(int calidad) {
		this.calidad = calidad;
	}
	
	//Metodo
	
	public void esDeCalidad() {
		if(calidad < 50) {
			System.out.println("Es de mala calidad");
		}
		System.out.println("Es de buena calidad");
	}
	
	//toString
	
	@Override
	public String toString() {
		return "CorteCerdo [nombreTienda=" + nombreTienda + ", calidad=" + calidad + "]";
	}
	
	
	
	
	
	
	
	
}	