package entidades;

public class Tronco extends Arbol {

	private double grosor;

	public Tronco() {
		super();

	}

	public Tronco(String nombre, double altura, boolean perenne, double grosor) {
		super(nombre, altura, perenne);
		this.grosor = grosor;
		// TODO Auto-generated constructor stub
	}

	public double getGrosor() {
		return grosor;
	}

	public void setGrosor(double grosor) {
		this.grosor = grosor;
	}

	@Override
	public boolean soyTronco() {
		// TODO Auto-generated method stub
		return true;
	}


}
