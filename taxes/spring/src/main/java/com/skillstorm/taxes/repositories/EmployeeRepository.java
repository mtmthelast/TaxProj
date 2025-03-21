package com.skillstorm.taxes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.taxes.models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
	Iterable<Employee> findByEmployeeCodeStartingWith(String startsWith);

}
