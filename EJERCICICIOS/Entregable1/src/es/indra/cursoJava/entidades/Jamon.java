package es.indra.cursoJava.entidades;

 

public class Jamon extends CorteCerdo{
int cantidad;
	@Override
public String toString() {
	return "Jamon [cantidad=" + cantidad + ", cortes=" + cortes + ", peso=" + peso + ", precio=" + precio
			+ ", getCantidad()=" + getCantidad() + ", toString()=" + super.toString() + ", getPrecio()=" + getPrecio()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}
	public Jamon(int cortes, double peso, double precio, int cantidad) {
	super(cortes, peso, precio);
	this.cantidad = cantidad;
}
	public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
	public Jamon(int cortes, double peso, double precio) {
		super(cortes, peso, precio);
		// TODO Auto-generated constructor stub
	}


}
