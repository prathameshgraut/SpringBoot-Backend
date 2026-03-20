package STS.SpringBoot.services;

import java.util.List;

import STS.SpringBoot.model.Employee;

public interface EmployeeService {
	
	//Save Employee Data
	Employee saveEmployee(Employee employee);

	//Get Employee Data To Fetch Multiple Record At Time Then Use To ArrayList
	List<Employee> getAllEmployees();
	
	//Get Employee By Id
	Employee getEmployeeById(Long Id);
}
