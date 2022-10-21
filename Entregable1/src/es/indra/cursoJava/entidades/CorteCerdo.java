package es.indra.cursoJava.entidades;

import java.util.Date;

public abstract class CorteCerdo {
	
private String localidadCompra;
private Date diaCompra;


public CorteCerdo(String localidadCompra, Date diaCompra) {
	this.localidadCompra = localidadCompra;
	this.diaCompra = diaCompra;
}


public String getLocalidadCompra() {
	return localidadCompra;
}


public void setLocalidadCompra(String localidadCompra) {
	this.localidadCompra = localidadCompra;
}


public Date getDiaCompra() {
	return diaCompra;
}


public void setDiaCompra(Date diaCompra) {
	this.diaCompra = diaCompra;
}


@Override
public String toString() {
	return "CorteCerdo [localidadCompra=" + localidadCompra + ", diaCompra=" + diaCompra + "]";
}





}
