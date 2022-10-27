package es.indra.ejercicioUsuario;

public class Main {

	private static Usuario cliente;

	public static void main(String[] args) {
		Usuario cliente = new Usuario.UsuarioBuilder()
				.id(102)
				.nombre("Alejandro")
				.primerApellido("Magno")
				.mail("correo@ejemplo.com")
				.build();
				

	}

}
