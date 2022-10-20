package Modelo;

import java.util.Date;

public class Pelicula {
	
	int anhoEstreno;
	boolean disponible;
	int duracion;
	Date fechaingreso;
	String nombre;
	String tituloOriginal;
	public int getAnhoEstreno() {
		return anhoEstreno;
	}
	public void setAnhoEstreno(int anhoEstreno) {
		this.anhoEstreno = anhoEstreno;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public Date getFechaingreso() {
		return fechaingreso;
	}
	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTituloOriginal() {
		return tituloOriginal;
	}
	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}
	
	

}
