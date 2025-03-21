package com.skillstorm.taxes.services;


import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.skillstorm.taxes.models.EmploymentSector;
import com.skillstorm.taxes.repositories.EmploymentSectorRepository;

@Service
public class EmploymentSectorService {
	
	private EmploymentSectorRepository repo;
	
	public EmploymentSectorService(EmploymentSectorRepository repo) {
		this.repo = repo;
	}
	


// find all
	public ResponseEntity<Iterable<EmploymentSector>> findAll(String startsWith) { 
		
		Iterable<EmploymentSector> employment_sector;
		
		try {
			if (startsWith == null)
				employment_sector = repo.findAll();
			else
				employment_sector = repo.findByEmploymentSecStartingWith(startsWith);
			
			if (!employment_sector.iterator().hasNext()) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body(employment_sector);
			} else {
				return ResponseEntity.ok(employment_sector);
			}
		} catch (Exception e) {
			return ResponseEntity.status(500).build();
		}
	}
	
	// find by id
	public ResponseEntity<EmploymentSector> findById(int id) {
		Optional<EmploymentSector> employment_sector = repo.findById(id);
		
		try {
			if (employment_sector.isEmpty())
				return ResponseEntity.notFound().build();
			
			return ResponseEntity.ok(employment_sector.get());
		} catch (Exception e) {
			return ResponseEntity.status(500).build();
		}
		
	}
	


}
