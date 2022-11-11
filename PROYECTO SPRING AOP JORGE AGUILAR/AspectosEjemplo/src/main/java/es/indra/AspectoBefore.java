package es.indra;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectoBefore {

	@Before("execution(* es.indra.*.*(..))")
	public void calculoTiempo() {
	 
	   System.out.println("Esto es un ejemplo @Before");
	     
	 }

}
