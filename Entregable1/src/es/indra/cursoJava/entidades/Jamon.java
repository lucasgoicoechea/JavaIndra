package es.indra.cursoJava.entidades;

public class Jamon extends CorteCerdo{

	protected int pesoJamon;
	
	
	public Jamon() {
		super();
	}
	
	public Jamon(String corteHorizontal, String corteVertical, int pesoJamon) {
		super(corteHorizontal, corteVertical);
		this.pesoJamon = pesoJamon;
	}

	//metodo
	public void pesoDelJamon() {
		if(pesoJamon >= 100) {
			System.out.println("La calidad del jamon es buena");
		}
		System.out.println("La calidad del jamon es regulera");
	}

	
	//Getter y seter
	public int getPesoJamon() {
		return pesoJamon;
	}

	public void setPesoJamon(int pesoJamon) {
		this.pesoJamon = pesoJamon;
	}

	@Override
	public String toString() {
		return "Jamon [pesoJamon=" + pesoJamon + ", corteHorizontal=" + corteHorizontal + ", corteVertical="
				+ corteVertical + "]";
	}

	
	
	
	
}
