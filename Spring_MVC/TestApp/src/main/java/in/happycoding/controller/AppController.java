package in.happycoding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.happycoding.dao.StudentDAO;
import in.happycoding.model.Student;

@Controller
public class AppController {

	@Autowired
	private StudentDAO studentDAO;
	
	@RequestMapping("/")
	public String indexPage(ModelMap model) {
		
		List<Student> studentsList = studentDAO.getAll();
		
		model.addAttribute("studentsList", studentsList);
		
		return "test";
	}
	
	@RequestMapping("/profile/{rollNumber}")
	public String profilePage(	@PathVariable("rollNumber") int rollNumber,
								ModelMap model) {
		
		Student theStudent = studentDAO.getById(rollNumber);
		
		model.addAttribute("student", theStudent);
		
		return "profile";
	}
	
	@RequestMapping("/delete/{rollNumber}")
	public String deleteAction(@PathVariable("rollNumber") int rollNumber) {
		
		System.out.println("DELETING "+rollNumber);
		
		studentDAO.deleteById(rollNumber);
		
		return "redirect:/";
	}
	
	@RequestMapping("/new-student")
	public String newStudentPage() {
		
		return "new-student";
	}
	
	@RequestMapping("/save-student")
	public String saveStudentAction(@RequestParam("rollNumber") int rollNumber,
									@RequestParam("firstName") String firstName,
									@RequestParam("lastName") String lastName) {
		
		System.out.println("Saving Student Record");
		
		Student theStudent = new Student(rollNumber, firstName, lastName);
		
		studentDAO.save(theStudent);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{rollNumber}")
	public String editPage(	@PathVariable("rollNumber") int rollNumber,
								ModelMap model) {
		
		Student theStudent = studentDAO.getById(rollNumber);
		
		model.addAttribute("student", theStudent);
		
		return "edit-student";
	}
	
	@RequestMapping(value = "/updatestudent", method = RequestMethod.POST)
	public String updateStudentAction() {
		
		System.out.println("Updating Student Record");
		
		
		
		return "redirect:/";
	}
	
}
