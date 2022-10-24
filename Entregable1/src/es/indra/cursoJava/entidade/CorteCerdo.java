package es.indra.cursoJava.entidade;

import java.util.Scanner;

public class CorteCerdo {
	protected  String pais;
	protected double cantidad;
	
	Scanner t = new Scanner(System.in);
	public CorteCerdo(String pais, double cantidad) {
		super();
		this.pais = pais;
		this.cantidad = cantidad;
	}
	public void nombrePais() {
		System.out.println("Introduce el nombre del país de procedencia");
		pais = t.next();
		
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "CorteCerdo [pais=" + pais + ", cantidad=" + cantidad + "]";
	}
	
	
	
}
