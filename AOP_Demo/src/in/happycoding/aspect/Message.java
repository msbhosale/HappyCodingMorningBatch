package in.happycoding.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Message {

	@Around("execution (* login())")
	public Object checkLogin(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("Checking IP Address");
		
		Object object = joinPoint.proceed();
		
		System.out.println("Login Time : 8:45");
		
		return object;
		
	}
	
}
