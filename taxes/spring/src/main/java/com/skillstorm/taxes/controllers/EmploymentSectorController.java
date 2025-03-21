package com.skillstorm.taxes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.skillstorm.taxes.models.EmploymentSector;
import com.skillstorm.taxes.services.EmploymentSectorService;

public class EmploymentSectorController {
	
private EmploymentSectorService service;
	
	public EmploymentSectorController(EmploymentSectorService service) {
		this.service = service;
	}
	@GetMapping
	public ResponseEntity<Iterable<EmploymentSector>> findAll(@RequestParam(required = false) String startsWith) {
		return service.findAll(startsWith);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EmploymentSector> findById(@PathVariable int id) {
		return service.findById(id);
	}

}
