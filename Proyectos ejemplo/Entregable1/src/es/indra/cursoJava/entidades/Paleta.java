package es.indra.cursoJava.entidades;

public class Paleta extends CorteCerdo {
	public Paleta(boolean soyCerdo) {
		super(soyCerdo);
	}

	@Override
	protected String parteDelCerdo() {
		return "Yo soy la Paleta";
	}
	
	protected boolean soyPaleta() {
		return true;
	}
}
