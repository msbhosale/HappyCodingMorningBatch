package in.happycoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping("/")
	public String homePage() {

		return "homepage";
	}

	@RequestMapping("/login")
	public String loginPage() {

		return "login";
	}

	@RequestMapping("/login-action")
	public String loginAction(@RequestParam("username") String username, @RequestParam("password") String password) {

		String query = "SELECT username FROM user WHERE username = ? AND password = ? ";

		Object[] params = { username, password };

		String userFromDB = jdbcTemplate.queryForObject(query, params, String.class);

		if (userFromDB != null) {
			System.out.println("User is valid");
		} else {
			System.out.println("Invalid User");
		}

		return "redirect:/";
	}
}
