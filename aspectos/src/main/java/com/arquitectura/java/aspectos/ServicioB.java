package com.arquitectura.java.aspectos;

public class ServicioB {
	public String metodo2() {
		try { 
			Thread.sleep(5000); 
		} catch (InterruptedException e) 
			{
			e.printStackTrace(); 
			} return "hola es el metodo2"; 
			} 
		}


