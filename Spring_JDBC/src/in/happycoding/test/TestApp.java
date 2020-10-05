package in.happycoding.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.bean.Student;
import in.happycoding.dao.StudentDAO;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		StudentDAO sd = (StudentDAO) context.getBean("studentDAO");
		
		List<Student> studentList = sd.getAll();
		
		for(Student theStudent : studentList) {
			
			System.out.println(theStudent);
		}
		
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


//sd.deleteById(101);

//Student theStudent = sd.getById(103);

//System.out.println(theStudent);

//System.out.println("Done");