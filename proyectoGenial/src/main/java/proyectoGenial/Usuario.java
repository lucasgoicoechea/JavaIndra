package proyectoGenial;

import java.io.Serializable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Builder
@Slf4j
public class Usuario implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private @Setter long id;
	private @Getter String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String mail;
	private String telefono;
	private boolean activo;
	
	
	

}
