package es.indra.cursoJava.entidades;

public class Solomillo extends CorteCerdo {
	public Solomillo(boolean soyCerdo) {
		super(soyCerdo);
	}

	@Override
	protected String parteDelCerdo() {
		return "Yo soy el Solomillo";
	}
	
	protected boolean soySolomillo() {
		return true;
	}
}
