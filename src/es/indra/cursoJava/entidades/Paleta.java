package es.indra.cursoJava.entidades;

public class Paleta extends CorteCerdo {

	private String lugarDestino;
	private float precio;
	
	
	public Paleta(String lugarDestino, float precio) {
		super();
		this.lugarDestino = lugarDestino;
		this.precio = precio;
	}


	public Paleta() {
		super();
		
	}


	public Paleta(String nombre, String procedencia, String nombreGranja, double peso, String destino, float precio) {
		super(nombre, procedencia, nombreGranja, peso);
		
		this.lugarDestino = destino;
		this.precio = precio;
	}

	
	//Gets y sets propios
	
	public String getLugarDestino() {
		return lugarDestino;
	}


	public void setLugarDestino(String lugarDestino) {
		this.lugarDestino = lugarDestino;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	//Metodos clase padre
	@Override
	public double getPeso() {
		return super.getPeso();
	}


	@Override
	public void setPeso(float peso) {
		super.setPeso(peso);
	}


	@Override
	public String toString() {
		return super.toString() +", lugarDestino=" + lugarDestino + ", precio=" + precio + "";
	}



	
	
}
