package es.indra.cursoJava.models;

import es.indra.cursoJava.interfaces.IInmueble;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Inmueble implements IInmueble {
	
	
	String direccion;
	Inventario inventarion;
	public String getDireccion() {
		return direccion;
	}
	public Inventario getInventarion() {
		return inventarion;
	}
	
	

}
