package com.skillstorm.taxes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.skillstorm.taxes.dtos.EmployeeDTO;
import com.skillstorm.taxes.models.Employee;
import com.skillstorm.taxes.services.EmployeeService;

public class EmployeeController {
	
private EmployeeService service;
	
	public EmployeeController(EmployeeService service) {
		this.service = service;
	}
	@GetMapping
	public ResponseEntity<Iterable<Employee>> findAll(@RequestParam(required = false) String startsWith) {
		return service.findAll(startsWith);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> findById(@PathVariable int id) {
		return service.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<Employee> createOne(@RequestBody EmployeeDTO dto) {
		return service.createOne(dto);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateOne(@PathVariable int id, @RequestBody EmployeeDTO dto) {
		return service.updateOne(id, dto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable int id) {
		return service.deleteById(id);
	}
	

}
