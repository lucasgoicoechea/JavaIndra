package es.indra;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectoAfterReturning {
	
	@AfterReturning(pointcut = "execution(* es.indra.*.*(..))", returning = "retVal")
	public void logAfterReturning(JoinPoint jp, Object retVal) throws Throwable {
		System.out.println("Método usado -> " +jp.getSignature());
		System.out.println("Mensaje devuelto -> " +retVal.toString());
	}
	
}
