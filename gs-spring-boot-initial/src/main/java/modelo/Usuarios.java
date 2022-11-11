package modelo;

import beans.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;

import controlador.Conexion;

public class Usuarios {
	
	public Usuario checkUser(String user, String password) {
		
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT * FROM usuarios WHERE nombre='"+user+"' and password='"+password+"';");
		
		//En esta clase esta diseñada para saber si el usuario existe ya o no y si da fallo le saltara la pantalla de registro fallido
		
		try {
			if(resultado!=null && resultado.next()) {
				int id = resultado.getInt("id");
				String nombre = resultado.getString("nombre");
				String pass = resultado.getString("password");
				Usuario usuario = new Usuario(id, nombre, pass);
				return usuario;
				//En este if si el resultado no vale porque el usuario no existe no entraria pero si eso es true y el resultSet sigue funcionando entonces
				//se puede checkear el id, nombre, password.
				
			}
				
		} catch (SQLException e) {
			
			//si el if falla como ultima opcion saldra la pantalla
			
			System.out.println();
		}
		
		return null;
	}
	

}