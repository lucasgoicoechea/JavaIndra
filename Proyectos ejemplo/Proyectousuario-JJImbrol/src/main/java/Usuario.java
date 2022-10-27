import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Usuario implements Serializable {
	long id;
	String nombre,primerApellido,segundoApellidomail,telefono;
}
