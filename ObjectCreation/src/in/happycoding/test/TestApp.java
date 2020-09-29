package in.happycoding.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.bean.Employee;
import in.happycoding.bean.Student;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee employee = context.getBean("employee",Employee.class);
		
		System.out.println(employee);
		
	}
}