package in.happycoding.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import in.happycoding.bean.Student;

@Component
public class StudentDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String getNameById(int rollNumber) {
		
		final String sql = "SELECT first_name FROM student WHERE roll_number = "+rollNumber;
		
		String name = jdbcTemplate.queryForObject(sql, String.class);
		
		return name;
	}
	
	public int getRollNumber(String name) {
		
		String query = "SELECT roll_number FROM student WHERE first_name = '"+name+"'";
		
		int rollNumber = jdbcTemplate.queryForObject(query, Integer.class);
		
		return rollNumber;
	}


	public void save(Student s) {
		
		String query = "INSERT INTO student VALUES (?,?,?)";
		
		Object[] params = {s.getRollNumber(),s.getFirstName(),s.getLastName()};
		
		jdbcTemplate.update(query, params);
		
	}
	
	public void update(Student s) {
		
		String query = "UPDATE student SET first_name = ? WHERE roll_number = ?";
		
		Object[] params = {s.getFirstName(),s.getRollNumber()};
		
		jdbcTemplate.update(query,params);
	}

	public void deleteById(int rollNumber) {
		
		String query = "DELETE FROM student WHERE roll_number = "+rollNumber;
		
		jdbcTemplate.update(query);
	}

}

// CRUD : CREATE, READ, UPADATE, DELETE





