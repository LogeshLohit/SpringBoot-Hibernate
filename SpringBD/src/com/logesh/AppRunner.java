package com.logesh;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

import com.employee.Employee;


@SpringBootApplication
@ComponentScan(basePackages={"com.employee"})
public class AppRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(AppRunner.class, args);
		/*SessionFactory factory = new Configuration().
				configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();*/
//		public List<Employee> getAllEmployees() {
		/*	session.beginTransaction().commit();
			Employee emp = new Employee();
			emp.setEmpName("Bharath");
			emp.setDesignation("Manager");
			session.save(emp);
			session.getTransaction().commit();
			System.out.println("saved");*/

		/*
		 * return employees;
		 * 
		 * }
		 */
	}

}
