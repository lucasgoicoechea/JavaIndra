package es.indra;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
public class ServicioA {
	 
	@AfterReturning 
public String metodo1() { return "hola es el metodo1"; }
}

 
