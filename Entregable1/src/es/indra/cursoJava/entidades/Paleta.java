package es.indra.cursoJava.entidades;

import java.util.Date;

public class Paleta extends CorteCerdo {

	private double peso;
	private double precio;

	public Paleta(String localidadCompra, Date diaCompra, double peso, double precio) {
		super(localidadCompra, diaCompra);
		this.peso = peso;
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Jamon [peso=" + peso + ", precio=" + precio + "]";
	}

	public void mostrarDatos() {
		System.out.println("Corte de cerdo - Paleta");
		System.out.println("Localidad de Compra: " + getLocalidadCompra());
		System.out.println("Día de compra: " + getDiaCompra());
		System.out.println("Peso: " + getPeso());
		System.out.println("Precio: " + getPrecio());

	}

}
