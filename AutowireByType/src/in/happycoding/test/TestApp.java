package in.happycoding.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.bean.Address;
import in.happycoding.bean.Date;
import in.happycoding.bean.Student;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Date theDate = (Date) context.getBean("date");
		
		theDate.setDay(30);
		theDate.setMonth(9);
		theDate.setYear(2020);
		
		Address theAddress = context.getBean("address",Address.class);
		
		theAddress.setCity("Pune");
		theAddress.setPin("123321");
		
		//=============================
		
		Student theStudent = (Student) context.getBean("student");
		
		theStudent.setName("Kalpna");
		theStudent.setRollNumber(190);
		
		theStudent.setBirthDate(theDate);
		theStudent.setAddress(theAddress);
		
		System.out.println(theStudent);
	}
}
