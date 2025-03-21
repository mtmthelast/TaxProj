package com.skillstorm.taxes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.skillstorm.taxes.models.FilingStatus;
import com.skillstorm.taxes.services.FilingStatusService;

public class FilingStatusController {
	
	
private FilingStatusService service;
	
	public FilingStatusController(FilingStatusService service) {
		this.service = service;
	}
	@GetMapping
	public ResponseEntity<Iterable<FilingStatus>> findAll(@RequestParam(required = false) String startsWith) {
		return service.findAll(startsWith);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<FilingStatus> findById(@PathVariable int id) {
		return service.findById(id);
	}

}
