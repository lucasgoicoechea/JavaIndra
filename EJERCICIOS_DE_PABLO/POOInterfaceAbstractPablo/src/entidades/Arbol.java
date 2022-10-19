package entidades;

import interfaces.IArbol;

public abstract class Arbol implements IArbol {

	protected String nombre;
	protected double altura;
	protected boolean perenne;

	public Arbol() {
		super();
	}

	public Arbol(String nombre, double altura, boolean perenne) {
		super();
		this.nombre = nombre;
		this.altura = altura;
		this.perenne = perenne;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean isPerenne() {
		return perenne;
	}

	public void setPerenne(boolean perenne) {
		this.perenne = perenne;
	}

	@Override
	public boolean soyTronco() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean soyRama() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
