package es.indra.cursoJava.entidades;

import java.time.LocalDate;

public class Solomillo extends CorteCerdo {


private boolean especiado;

public Solomillo(double peso, double precioKilo, LocalDate fechaCorte, boolean especiado) {
	super(peso, precioKilo, fechaCorte);
	this.especiado = especiado;
}

public boolean getEspeciado() {
	return especiado;
}

public void setEspeciado(boolean especiado) {
	this.especiado = especiado;
}

public double precioFinal() {
	double precioFinal = 0;
	if(especiado) {
	 precioFinal = getPeso()*(getPrecioKilo()+1);
	}
	else {
		precioFinal = calcularPrecio();
	}
	return precioFinal;
}


}
