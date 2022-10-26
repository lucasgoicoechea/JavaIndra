package ejercicioMaven;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Slf4j

public class Usuario implements Serializable {
	
	long id;
	@Setter String nombre;
	@Getter String primerApellido;
	String segundoApellido;
	String mail;
	String telefono;
	boolean activo;

}
