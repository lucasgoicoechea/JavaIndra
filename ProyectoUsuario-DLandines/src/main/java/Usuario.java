import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
@Builder
public class Usuario implements Serializable{
	private static final long serialVersionUID = 2599368614755368860L;
	private @Setter long id;
	private @Getter String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String mail;
	private String telefono;
	private boolean activo;
	
	

}
