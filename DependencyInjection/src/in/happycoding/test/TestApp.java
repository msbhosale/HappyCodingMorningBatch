package in.happycoding.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.model.Car;
import in.happycoding.model.Engine;

public class TestApp {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Car theCar = (Car) context.getBean("c1");
		
		theCar.run();
	}
}