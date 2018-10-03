package com.employee;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Employee;

@RestController
public class HelloController {

	@RequestMapping("/greet")
	public String greetUser(@RequestParam("name") String name) {
		return "Hello User! " + name.toUpperCase();
	}

	@RequestMapping("/list")
	public List<String> getList() {

		return Arrays.asList(new String("Hello"), new String("How are you"));

	}

}
