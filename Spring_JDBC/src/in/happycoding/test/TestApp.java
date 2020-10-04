package in.happycoding.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.bean.Student;
import in.happycoding.dao.StudentDAO;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		StudentDAO sd = (StudentDAO) context.getBean("studentDAO");
		
		sd.deleteById(101);
		
		System.out.println("Done");
		
	}
}






//String name = sd.getNameById(101);
//
//System.out.println(name);
//int rollNumber = sd.getRollNumber("MS");
//
//System.out.println(rollNumber);

//Student student = new Student(105, "Ameer", "Khan");

//sd.update(student);