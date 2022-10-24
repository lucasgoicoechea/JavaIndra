package es.indra.cursoJava.entidades;

import java.time.LocalDate;

public class CorteCerdo {

	private double peso;
	private double precioKilo;
	private LocalDate fechaCorte;
	
	public CorteCerdo(double peso, double precioKilo, LocalDate fechaCorte) {
		super();
		this.peso = peso;
		this.precioKilo = precioKilo;
		this.fechaCorte = fechaCorte;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecioKilo() {
		return precioKilo;
	}

	public void setPrecioKilo(double precioKilo) {
		this.precioKilo = precioKilo;
	}

	public LocalDate getFechaCorte() {
		return fechaCorte;
	}

	public void setFechaCorte(LocalDate fechaCorte) {
		this.fechaCorte = fechaCorte;
	}
	
	public double calcularPrecio() {
		double precioFinal = precioKilo*peso;
		
		return precioFinal;
	}
	
	
}
