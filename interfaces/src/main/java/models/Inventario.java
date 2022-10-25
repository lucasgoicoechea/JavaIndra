package models;

import java.util.ArrayList;

public class Inventario {
	
	String inventario="Mueble";

	ArrayList<String> muebles = new ArrayList<String>();

	public Inventario() {
		// TODO Auto-generated constructor stub
		muebles.add("Silla");
		muebles.add("Mesa");
		muebles.add("Armario");
		muebles.add("Sofa");
	}
	
	public ArrayList<String> mueblestoString() {
		return muebles;	
	}

}
