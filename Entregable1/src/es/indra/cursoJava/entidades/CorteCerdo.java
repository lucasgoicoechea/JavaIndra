package es.indra.cursoJava.entidades;

public class CorteCerdo {
	
	public String establecimiento;
	public int valor;

	public CorteCerdo(int valor, String establecimiento) {
		this.establecimiento = establecimiento;
		this.valor = valor;
	}
	

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getEstablecimiento() {
		return establecimiento;
	}

	public void setEstablecimiento(String establecimiento) {
		this.establecimiento = establecimiento;
	}
	
	
}