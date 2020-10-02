package in.happycoding.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Display {

	@Around("execution (* attendence())")
	public Object attendenceAspect(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("Welcome to Happy Coding");
		
		Object object = joinPoint.proceed();
		
		System.out.println("Have a great day!");
		
		return object;
	}
}
