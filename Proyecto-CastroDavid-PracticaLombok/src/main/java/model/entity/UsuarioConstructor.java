package model.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
public class UsuarioConstructor implements Serializable {

	/**
	 * En el ejemplo anterior, hemos anotado la clase con @NoArgsConstructor 
	 * y@AllArgsConstructor, y comprobamos que el resultado en el outline,
	 * es que tenemos dos constructores: uno sin argumentos y otro con todos 
	 * los argumentos.
	 */
	
	private static final long serialVersionUID = 1L;

	private long id;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String mail;
	private String telefono;
	private boolean activo;

}
