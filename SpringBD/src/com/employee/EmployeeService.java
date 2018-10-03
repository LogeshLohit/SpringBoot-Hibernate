package com.employee;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@PersistenceContext
public class EmployeeService {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
			.buildSessionFactory();

	public List<Employee> getAllEmployees() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Employee> employees = session.createQuery("FROM Employee").list();
		session.getTransaction().commit();
		return employees;

	}

	public Employee getEmployee(Integer empId) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Employee employee = session.get(Employee.class, empId.intValue());
		session.getTransaction().commit();
		return employee;
	}

	public void addEmployee(Employee employee) {
		Session session = factory.getCurrentSession();
		session.beginTransaction().commit();
		Employee emp = new Employee();
		emp.setEmpName(employee.getEmpName());
		emp.setDesignation(employee.getDesignation());
		session.save(emp);
		session.getTransaction().commit();
		System.out.println(employee.getEmpName() + " saved sucessfully.");

	}

}
