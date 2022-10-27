package SetEjercicio;

public class ElementoSet {
	
	
	
	protected int orden;
	protected double precio;
	protected String serial;
	
	
	
	public ElementoSet(double precio, String serial) {
		super();
		this.precio = precio;
		this.serial = serial;
	}


	@Override
	public String toString() {
		return "ElementoDeSet [orden=" + orden + ", precio=" + precio + ", serial=" + serial + "]";
	}

}
