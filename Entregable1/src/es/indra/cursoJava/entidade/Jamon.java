package es.indra.cursoJava.entidade;

import java.util.Scanner;

public class Jamon extends CorteCerdo {
	private double peso;
	
	
	Scanner t = new Scanner(System.in);
	public Jamon(String pais, double cantidad, double peso) {
		super(pais, cantidad);
		// TODO Auto-generated constructor stub
		this.peso=peso;
	}
	public void obtenerDatos() {
		
		System.out.println("El peso total del jamón es "+peso);
		System.out.println("Cantidad de jamones: "+getCantidad());
		System.out.println("Pais: "+getPais());
		
	}
	
	

	@Override
	public void nombrePais() {
		// TODO Auto-generated method stub
		super.nombrePais();
	}
	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	
	@Override
	public String toString() {
		return "Jamon [peso=" + peso +"]";
	}
	
	

}
