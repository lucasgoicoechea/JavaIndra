package es.indra.cursoJava.entidades;

public class Jamon extends CorteCerdo{
	
	int peso;
	
	public Jamon(int precio, String carniceria) {
		super(precio, carniceria);
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void producto() 
	{
		System.out.println("El producto cuesta: " + getPrecio() + " , pesa: "+ getPeso() + " y ha sido comprado en: " + getCarniceria());
	}
	
}