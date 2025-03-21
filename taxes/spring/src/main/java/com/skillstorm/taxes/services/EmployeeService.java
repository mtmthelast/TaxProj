package com.skillstorm.taxes.services;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.skillstorm.taxes.dtos.EmployeeDTO;
import com.skillstorm.taxes.models.Employee;
import com.skillstorm.taxes.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Value("${base-url}")
	private String baseURL;
	
	private EmployeeRepository repo;
	
	public EmployeeService(EmployeeRepository repo) {
		this.repo= repo;
	}
	
	// find all
		public ResponseEntity<Iterable<Employee>> findAll(String startsWith) { 
			
			Iterable<Employee> employees;
			
			try {
				if (startsWith == null)
					employees = repo.findAll();
				else
					employees = repo.findByEmployeeCodeStartingWith(startsWith);
				
				if (!employees.iterator().hasNext()) {
					return ResponseEntity.status(HttpStatus.NO_CONTENT).body(employees);
				} else {
					return ResponseEntity.ok(employees);
				}
			} catch (Exception e) {
				return ResponseEntity.status(500).build();
			}
		}
		
		// find by id
		public ResponseEntity<Employee> findById(int id) {
			Optional<Employee> employee = repo.findById(id);
			
			try {
				if (employee.isEmpty())
					return ResponseEntity.notFound().build();
				
				return ResponseEntity.ok(employee.get());
			} catch (Exception e) {
				return ResponseEntity.status(500).build();
			}
			
		}
		
		// create one
		public ResponseEntity<Employee> createOne(EmployeeDTO dto) {
			try {
				 Employee saved = repo.save(new Employee(0, dto.first_name(), dto.last_name(), dto.employee_id(), dto.administrator()));
				 return ResponseEntity.created(new URI(this.baseURL + "employee/" + saved.getId())).body(saved);
				 
			} catch (Exception e) {
				return ResponseEntity.status(500).build();
			}
		}
		
		// update one
		public ResponseEntity<Employee> updateOne(int id, EmployeeDTO dto) { 
			try {
				if (repo.existsById(id))
					return ResponseEntity.ok(repo.save(new Employee(id, dto.first_name(), dto.last_name(), dto.employee_id(), dto.administrator())));
				return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
			} catch (Exception e) {
				return ResponseEntity.status(500).build();
			}
		}
		
		// delete one
		public ResponseEntity<Void> deleteById(int id) {
			try {
				repo.deleteById(id);
				return ResponseEntity.noContent().build();
			} catch (Exception e) {
				return ResponseEntity.status(500).build();
			}
		}

}
