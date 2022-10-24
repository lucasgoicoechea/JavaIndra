package es.indra.cursoJava.entidades;

public class Solomillo extends CorteCerdo {

	private String lugarDestino;
	private double precio;
	
	

	public Solomillo() {
		super();
	}


	public Solomillo(String nombre, String procedencia, String nombreGranja, double peso,String lugarDestino, double precio) {
		super(nombre, procedencia, nombreGranja, peso);
		this.lugarDestino = lugarDestino;
		this.precio = precio;
	}

	//Gets y sets propios
	public String getLugarDestino() {
		return lugarDestino;
	}


	public void setLugarDestino(String lugarDestino) {
		this.lugarDestino = lugarDestino;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
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


//	@Override
//	public String toString() {
//		return super.toString() + "===Solomillo [lugarDestino=" + lugarDestino + ", precio=" + precio + "]";
//	}
//

	@Override
	public String toString() {
		return super.toString() + ", lugarDestino=" + lugarDestino + ", precio=" + precio + "";
	}
	
	

	
	
}
