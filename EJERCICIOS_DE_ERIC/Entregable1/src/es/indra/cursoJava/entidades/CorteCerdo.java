package es.indra.cursoJava.entidades;

public class CorteCerdo {
int cortes;
double peso,precio;
@Override
public String toString() {
	return "CorteCerdo [cortes=" + cortes + ", peso=" + peso + ", precio=" + precio + ", getPrecio()=" + getPrecio()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public CorteCerdo(int cortes, double peso, double precio) {
	super();
	this.cortes = cortes;
	this.peso = peso;
	this.precio = precio;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}

}
