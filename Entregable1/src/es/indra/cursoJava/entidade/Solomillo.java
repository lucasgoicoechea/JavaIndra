package es.indra.cursoJava.entidade;

public class Solomillo extends CorteCerdo{
	double coste;
	public Solomillo(String pais, double cantidad,double coste) {
		super(pais, cantidad);
		// TODO Auto-generated constructor stub
		this.coste=coste;
	}
	public void obtenerDatos() {
		
		System.out.println("El coste total del solomillo es "+coste);
		
	}
	public double getCoste() {
		return coste;
	}
	public void setCoste(double coste) {
		this.coste = coste;
	}
	@Override
	public String getPais() {
		// TODO Auto-generated method stub
		return super.getPais();
	}
	@Override
	public String toString() {
		return "Solomillo [coste=" + coste + ", getCoste()=" + getCoste() + ", getPais()=" + getPais() + "]";
	}
	

}
