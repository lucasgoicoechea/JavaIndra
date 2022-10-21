package es.indra.cursoJava.entidades;

public class Paleta extends CorteCerdo{

	protected int pesoPaleta;
	
	
	public Paleta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paleta(String corteHorizontal, String corteVertical, int pesoPaleta) {
		super(corteHorizontal, corteVertical);
		this.pesoPaleta = pesoPaleta;
	}


	//metodo
	public void pesoDePaleta() {
		if(pesoPaleta >= 10) {
			System.out.println("La calidad del jamon es buena");
		}
		System.out.println("La calidad del jamon es regulera");
	}
	

	//getter y seter
	public int getPesoPaleta() {
		return pesoPaleta;
	}

	public void setPesoPaleta(int pesoPaleta) {
		this.pesoPaleta = pesoPaleta;
	}

	@Override
	public String toString() {
		return "Paleta [pesoPaleta=" + pesoPaleta + ", corteHorizontal=" + corteHorizontal + ", corteVertical="
				+ corteVertical + "]";
	}

	
	
	
}
