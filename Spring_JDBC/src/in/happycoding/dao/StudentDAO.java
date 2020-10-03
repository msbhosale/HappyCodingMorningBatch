package in.happycoding.dao;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

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
}

// CRUD : CREATE, READ, UPADATE, DELETE





