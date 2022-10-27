package es.indra.jaguilarv.entidades;

public class Main {

	public static void main(String[] args) {
		Usuario cliente = new Usuario.UsuarioBuilder()
                            .id(102)
                            .nombre("Alejandro")
                            .primerApellido("Magno")
                            .mail("correo@ejemplo.com")
                            .activo(true)
                            .telefono("+34 123456789")
                            .build();
		
		System.out.println(cliente);


	}

}
