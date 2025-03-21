package com.skillstorm.taxes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.skillstorm.taxes.dtos.ClientDTO;
import com.skillstorm.taxes.models.Client;
import com.skillstorm.taxes.services.ClientService;


public class ClientController {
	
private ClientService service;
	
	public ClientController(ClientService service) {
		this.service = service;
	}
	@GetMapping
	public ResponseEntity<Iterable<Client>> findAll(@RequestParam(required = false) String startsWith) {
		return service.findAll(startsWith);
	}
	
	@GetMapping("/{social_security_number}")
	public ResponseEntity<Client> findById(@PathVariable int social_security_number) {
		return service.findById(social_security_number);
	}
	
	@PostMapping
	public ResponseEntity<Client> createOne(@RequestBody ClientDTO dto) {
		return service.createOne(dto);
	}
	
	@PutMapping("/{social_security_number}")
	public ResponseEntity<Client> updateOne(@PathVariable int social_security_number, @RequestBody ClientDTO dto) {
		return service.updateOne(social_security_number, dto);
	}
	
	@DeleteMapping("/{social_security_number}")
	public ResponseEntity<Void> deleteById(@PathVariable int social_security_number) {
		return service.deleteById(social_security_number);
	}
	


}
