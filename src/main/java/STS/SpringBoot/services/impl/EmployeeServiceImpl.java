package STS.SpringBoot.services.impl;

import org.springframework.stereotype.Service;

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



	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}           

}
