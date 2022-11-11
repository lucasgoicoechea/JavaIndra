package es.indra;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectoBefore {

	@Pointcut("execution(* es.indra.ServicioB.metodo2(..))")
	   private void selectMetodo2(){}
	
	@Before("selectMetodo2()")
	public void beforeMetodo2(){
	      System.out.println("Ahora vamos con el metodo 2.");
	   }  
	
}
