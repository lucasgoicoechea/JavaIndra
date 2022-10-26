/**
 * 
 */
package model.entity;

import java.io.Serializable;

import lombok.Builder;


/**
 * @author 34667
 *
 */

@Builder
public class Usuario implements Serializable {

	/**
	 * Lombok también nos permite implementar el patrón Builder 
	 * de forma efectiva en nuestro código, únicamente debemos anotar 
	 * la clase con @Builder, y automáticamente nos creará el método 
	 * público build y el objeto estático Builder con todos sus atributos y 
	 * métodos.
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
