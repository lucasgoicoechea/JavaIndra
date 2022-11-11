package es.indra;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Cacheable
//@Cacheable se puede marcar en métodos o clases. Cuando está marcado en un método, 
//significa que el método admite el almacenamiento en caché. Cuando está marcado en una clase,
//significa que todos los métodos de esa clase admiten el almacenamiento en caché
public class AspectoTiempo {
	@Around("execution(* es.indra.*.*(..))")
	/*
	 * Esta anotación ejecuta parte del advice antes y parte después de la ejecución
	 * del punto de corte especificado. La filosofía consiste en que el usuario es
	 * el que debe especificar en el código del advice en qué momento se debe llamar
	 * al punto de corte. Por ello, el advice debe tener como mínimo un parámetro de
	 * la clase ProceedingJoinPoint, que representa el punto de corte. Llamando al
	 * método proceed() de esta clase, ejecutamos el punto de corte.
	 */
	@Before("execution(* es.indra.*.*(..))")
//	Esta anotación ejecuta un advice antes de la ejecución del punto de corte especificado
	@AfterReturning("execution(* es.indra.*.*(..))")
//	Esta anotación ejecuta un advice después de la ejecución del punto de corte especificado,
//	siempre que el método del punto de corte retorne de forma normal 
	public Object calculoTiempo(ProceedingJoinPoint joinPoint) throws Throwable {
		long t1 = System.currentTimeMillis();
		Object resultado = joinPoint.proceed();
		long t2 = System.currentTimeMillis();
		System.out.println("t1 es: " + t1 + "t2 es: " + t2 + "el total es : " + (t2 - t1));
		if (t2 - t1 > 2000) {
			System.out.println("Metodo lento:" + joinPoint.getTarget().getClass() + "."
					+ joinPoint.getSignature().getName() + ":" + (t2 - t1));
		}
		return resultado;
	}
}