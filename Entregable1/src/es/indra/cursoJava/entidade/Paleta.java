package es.indra.cursoJava.entidade;

import java.util.Scanner;

public class Paleta extends CorteCerdo {
	double coste;
	Scanner t = new Scanner(System.in);
	public Paleta(String pais, double cantidad, double coste) {
		super(pais, cantidad);
		// TODO Auto-generated constructor stub
		this.coste = coste;
		
	}
	public void obtenerDatos() {
		
		System.out.println("El coste total de la paleta es "+coste);
		
	}
	
	@Override
	public void nombrePais() {
		// TODO Auto-generated method stub
		super.nombrePais();
	}
	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}
	@Override
	public String toString() {
		return "Paleta [coste=" + coste + ", getPais()=" + getPais() + ", getCantidad()=" + getCantidad() + "]";
	}
	
	


}
