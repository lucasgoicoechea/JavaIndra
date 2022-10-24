package es.indra.cursojava.entidades;

/*
- Realizar un nuevo proyecto Java, llamado Entregable1.
- Debe contener 4 clases java, 
  - Jamon (clase hija)
  - Paleta (clase hija)
  - Solomillo (clase hija)
  - CorteCerdo (clase padre)
- deben estar dentro del paquete es.indra.cursoJava.entidades
- deben contener atributos heredados de la clase padre y al menos
1 atributo propio de la clase hija, y un metodo de la clase padre
y al menos 1 metodo propio de la clase hija.
Prioridad entregar por branch propio en el GITHUB y sino por
EMAIL:  LUCASGOICOECHEA@GMAIL.COM
*/

public class Paleta extends CortedeCerdo {

	String paleta="paleta";

	protected void parte() {
		System.out.println(partes+" la "+paleta);
	}
	@Override
	protected String Divido() {
		return  "soy la paleta";
	}

}
