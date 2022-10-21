package es.indra.cursoJava.entidades;

public class Solomillo extends CorteCerdo {

	protected int pesoSolomillo;

	
	public Solomillo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Solomillo(String corteHorizontal, String corteVertical, int pesoSolomillo) {
		super(corteHorizontal, corteVertical);
		this.pesoSolomillo = pesoSolomillo;
	}

	//metodo
	public void pesoDelSolomillo() {
		if(pesoSolomillo >= 10) {
			System.out.println("La calidad del jamon es buena");
		}
		System.out.println("La calidad del jamon es regulera");
	}

	// getter y seter
	public int getPesoSolomillo() {
		return pesoSolomillo;
	}

	public void setPesoSolomillo(int pesoSolomillo) {
		this.pesoSolomillo = pesoSolomillo;
	}

	
	@Override
	public String toString() {
		return "Solomillo [pesoSolomillo=" + pesoSolomillo + ", corteHorizontal=" + corteHorizontal + ", corteVertical="
				+ corteVertical + "]";
	}
	

	

}
