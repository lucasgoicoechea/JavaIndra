package es.indra.cursoJava.entidades;

public class CorteCerdo {
	
	public String Vendedor;
	public int valor;

	public String getVendedor() {
		return Vendedor;
	}

	public void setVendedor(String vendedor) {
		Vendedor = vendedor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public CorteCerdo(int valor, String vendedor) {
		this.Vendedor = vendedor;
		this.valor = valor;
	}
	


	
	
}
