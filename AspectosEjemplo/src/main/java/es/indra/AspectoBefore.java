package es.indra;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectoBefore {
	@Before("execution(* es.indra.*.*(..))")
	public void hi(JoinPoint joinPoint) {
		
		System.out.println("Hi world of Dome ");
		System.out.println(", before " + joinPoint.getSignature().getName()+" method");
	}
	
}
