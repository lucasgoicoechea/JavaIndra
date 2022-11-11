package beans;

public class Usuario {

	String nombre;
	String password;
	int id;
	
	//Objeto Usuario para creacion de usuario y tabla de usuarios en la database
	
	public Usuario(){
		
		
	}
	
	//Constructor donde se elimina el usuario
	
	public Usuario(int id, String nombre, String password){
		this.id=id;
		this.nombre=nombre;
		this.password=password;
	}
	
	//Constructor donde se crea el usuario
	
	public Usuario(String nombre, String password){
		this.nombre=nombre;
		this.password=password;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		
		return password;
	}
	
	//Getter & Setters creados para el uso de Objeto de Usuario
	
	public void setPassword(String password) {
		
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}	
}