package STS.SpringBoot.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import STS.SpringBoot.exception.ResourceNotFoundException;
import STS.SpringBoot.model.Employee;
import STS.SpringBoot.repository.EmployeeRepository;
import STS.SpringBoot.services.EmployeeService;


/*@service Annotation Used For Tells Service Layer & Implemented Business logic Data.
 * Impl Stand For Implementation
 */
@Service           
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository; 
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	//Save Employee Method 
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}


	//Get Employee Method
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}


	//Get Employee By Id [Need To Required Fild like Parameyters]
	@Override
	public Employee getEmployeeById(Long Id) {
//		Optional<Employee> employee = employeeRepository.findById(Id);   //Optional Mean Value Is Present Or Not Present
//		if(employee.isPresent()) {
//			return employee.get();
//		}else {
//			throw new ResourceNotFoundException("Employee","Id",Id);
//		}
		
		//Used lambda Expression
		return employeeRepository.findById(Id).orElseThrow(()->new ResourceNotFoundException("Employee","Id", Id));
	}           

}
