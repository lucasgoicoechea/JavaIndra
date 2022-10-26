import lombok.Builder;
import java.io.Serializable;
import lombok.extern.slf4j.Slf4j;

@Builder
@Slf4j
public class usuario implements Serializable{
	private long id;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String mail;
	private String telefono;
	private boolean activo;
}
