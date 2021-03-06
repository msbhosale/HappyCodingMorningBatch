package in.happycoding.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.bean.Bank;
import in.happycoding.bean.School;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Bank theBank = (Bank) context.getBean("bank");
		
		boolean status = theBank.createAccount();
		
		System.out.println("Account created successfully");
		
	}
}