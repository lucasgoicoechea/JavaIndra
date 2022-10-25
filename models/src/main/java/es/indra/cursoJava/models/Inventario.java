package es.indra.cursoJava.models;

import java.util.ArrayList;

public class Inventario {
	
	String inventario="Armario";
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
