package entidades;

import lombok.Builder;
import lombok.Data;
import lombok.extern.java.Log;


@Builder
@Log
@Data
public class Usuario {

	private long id;
	private String nombre, primerApellido, segundoApellido, mail, telefono;
	private boolean activo;
	
}
