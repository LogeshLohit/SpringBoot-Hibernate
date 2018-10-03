package com.employee;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//@EnableAutoConfiguration
//@SpringBootApplication
public class AppRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SpringApplication.run(AppRunner.class, args);
		SessionFactory factory = new Configuration().
				configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
//		public List<Employee> getAllEmployees() {
			Session session = factory.openSession();
			System.out.println("99");
			//session.beginTransaction();
			Integer empId = 3;
			session.beginTransaction();
			Employee employee = session.get(Employee.class, empId.intValue());
			System.out.println(employee);
			session.getTransaction().commit();
			
			/*Employee emp = session.get(Employee.class, 3);
			System.out.println(emp);
			*///session.getTransaction().commit();
			
			//Insert works fine
		

		/*
		 * return employees;
		 * 
		 * }
		 */
	}

}
