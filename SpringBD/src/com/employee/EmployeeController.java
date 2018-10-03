package com.employee;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.getAllEmployees();

	}

	@RequestMapping("/employees/{empId}")
	public Employee getEmployee(@PathVariable("empId") Integer empId) {
		System.out.println("Id received:" + empId);
		return employeeService.getEmployee(empId);
	}

	@RequestMapping(method = RequestMethod.POST, value="/employees")
	public void addEmployees(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);

	}

}
