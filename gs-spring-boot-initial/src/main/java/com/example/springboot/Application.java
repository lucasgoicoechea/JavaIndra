package com.example.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(AspectosApplication.class, args);
        ApplicationContext contexto=SpringApplication.run(Application.class, args);
        
        ServicioA miservicioA=contexto.getBean(ServicioA.class);
        System.out.println(miservicioA.metodo1());
         
        ServicioB miservicioB=contexto.getBean(ServicioB.class);
     
        System.out.println(miservicioB.metodo2());

	}

	
}