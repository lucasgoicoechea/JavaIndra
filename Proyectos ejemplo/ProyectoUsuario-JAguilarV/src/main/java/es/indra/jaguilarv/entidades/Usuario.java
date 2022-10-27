package es.indra.jaguilarv.entidades;

import java.io.Serializable;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private long id;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String mail;
	private String telefono;
	private boolean activo;

}
