package es.indra.cursoJava.entidades;

import java.time.LocalDate;

public class Paleta extends CorteCerdo{

	private boolean iberico;

	public Paleta(double peso, double precioKilo, LocalDate fechaCorte, boolean iberico) {
		super(peso, precioKilo, fechaCorte);
		this.iberico = iberico;
	}

	public boolean isIberico() {
		return iberico;
	}

	public void setIberico(boolean iberico) {
		this.iberico = iberico;
	}
	
	public double precioFinal() {
		double precioFinal = 0;
		if(iberico) {
		 precioFinal = getPeso()*(getPrecioKilo()+4);
		}
		else {
			precioFinal = calcularPrecio();
		}
		return precioFinal;
	}
}
