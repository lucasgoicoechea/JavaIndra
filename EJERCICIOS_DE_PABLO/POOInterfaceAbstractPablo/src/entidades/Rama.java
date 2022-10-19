package entidades;

public class Rama extends Tronco {

	private double longitud;

	public Rama() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rama(String nombre, double altura, boolean perenne, double grosor, double longitud) {
		super(nombre, altura, perenne, grosor);
		this.longitud = longitud;
		// TODO Auto-generated constructor stub
	}

	public double getLongitud() {
		return longitud;
	}
	
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@Override
	public boolean soyTronco() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean soyRama() {
		// TODO Auto-generated method stub
		return true;
	}

}
