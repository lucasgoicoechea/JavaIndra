package es.indra.cursoJava.entidade;

public class main {

	public static void main(String[] args) {
		CorteCerdo cc = new CorteCerdo("España", 11);
		Jamon j = new Jamon(cc.getPais(), cc.getCantidad(),125);
		j.obtenerDatos();
		Solomillo s = new Solomillo(cc.getPais(), cc.getCantidad(),156);
		s.obtenerDatos();
		Paleta p = new Paleta(cc.getPais(), cc.getCantidad(), 95);
		p.obtenerDatos();
	}

}
