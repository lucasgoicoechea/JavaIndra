package com.arquitectura.java.aspectos;

import org.aspectj.lang.annotation.Before;

public class AspectoBefore {
	@Before("execution(* es.indra.*.*(..))")
	public void calculoTiempo() {
	 
	   System.out.println("Esto es un ejemplo @Before");
	     
	 }

}