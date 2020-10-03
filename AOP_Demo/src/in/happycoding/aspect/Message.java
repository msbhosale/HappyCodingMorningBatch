package in.happycoding.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Message {
	
	

	@AfterReturning(pointcut = "execution (* in.happycoding.bean.Bank.*(..))",
			returning = "accountStatus")
	public void creatAccount(boolean accountStatus) {
		
		System.out.println("Account status : "+accountStatus);
	}
	
}
