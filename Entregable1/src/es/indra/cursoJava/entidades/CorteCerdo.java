package es.indra.cursoJava.entidades;

public class CorteCerdo {

	protected String corteHorizontal;
	protected String corteVertical;
	
	
	
	public String corteH() {
		return corteHorizontal;
	}
	
	public String corteV() {
		return corteVertical;
	}

	//Contructor
	public CorteCerdo() {}
	
	public CorteCerdo(String corteHorizontal, String corteVertical) {
		super();
		this.corteHorizontal = corteHorizontal;
		this.corteVertical = corteVertical;
	}

	//Getter y seter
	public String getCorteHorizontal() {
		return corteHorizontal;
	}

	public void setCorteHorizontal(String corteHorizontal) {
		this.corteHorizontal = corteHorizontal;
	}

	public String getCorteVertical() {
		return corteVertical;
	}

	public void setCorteVertical(String corteVertical) {
		this.corteVertical = corteVertical;
	}

	//toString
	@Override
	public String toString() {
		return "CorteCerdo [corteHorizontal=" + corteHorizontal + ", corteVertical=" + corteVertical + "]";
	}
	
	
	
}
