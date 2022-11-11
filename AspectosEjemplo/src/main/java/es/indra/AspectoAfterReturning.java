package es.indra;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectoAfterReturning {
	@AfterReturning("execution(* es.indra.*.*(..))")
	public void afterReturning(JoinPoint joinPoint) {
		System.out.println("After Returning method "+joinPoint);
	}

}
