package in.happycoding.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import in.happycoding.model.Student;

@Component
public class StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Student getById(int rollNumber) {

		String query = "SELECT * FROM student WHERE roll_number = " + rollNumber;

		Student student = jdbcTemplate.queryForObject(query, new StudentMapper());

		return student;
	}
	
	public List<Student> getAll(){
		
		String query = "SELECT * FROM student";
		
		return jdbcTemplate.query(query, new StudentMapper());
	}
	

	public class StudentMapper implements RowMapper<Student> {

		@Override
		public Student mapRow(ResultSet rs, int row) throws SQLException {

			int rollNumber = rs.getInt("roll_number");
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");

			Student student = new Student(rollNumber, firstName, lastName);

			return student;
		}

	}
}