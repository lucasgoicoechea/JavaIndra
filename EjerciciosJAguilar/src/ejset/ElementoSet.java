package ejset;

public class ElementoSet {
	int orden;
	double precio;
	String serial;
	
	public ElementoSet(double precio, String serial) {
		this.precio = precio;
		this.serial = serial;
	}

	@Override
	public String toString() {
		return "ElementoSet [orden=" + orden + ", precio=" + precio + ", serial=" + serial + "]";
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}
	
	
}
