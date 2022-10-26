package es.indra.cursoJava.models;

public class Inventario {
	
	String[] arr = new String [9];
	
	public Inventario() {
		// TODO Auto-generated constructor stub	
		
		for (int i =0; i!=arr.length; i++) {
			arr[i] = "mueble [i]" ;
		}
	}
	
	public String[] mostrarArray() {
		return arr;
	}
}
