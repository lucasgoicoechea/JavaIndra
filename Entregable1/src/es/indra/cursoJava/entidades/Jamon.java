package es.indra.cursoJava.entidades;

public class Jamon extends CorteCerdo {
	public Jamon(boolean soyCerdo) {
		super(soyCerdo);
	}

	@Override
	protected String parteDelCerdo() {
		return "Yo soy el Jamón";
	}
	
	protected boolean soyJamon() {
		return true;
	}
}
