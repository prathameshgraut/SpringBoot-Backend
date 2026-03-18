package STS.SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import STS.SpringBoot.model.Employee;


/*
 * Extends jpaRepository Because This Are Provided All DB Related CRUD Operation.
 * Provided Two Parameter Entity Class Name & Primary Key
*/
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
