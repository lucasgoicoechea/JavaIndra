package es.indra.cursoJava.entidades;

public class CorteCerdo {
	protected boolean soyCerdo;

	public CorteCerdo(boolean soyCerdo) {
		this.soyCerdo = soyCerdo;
	}

	protected String parteDelCerdo() {
		return "Yo soy el cerdo";
	}
}
