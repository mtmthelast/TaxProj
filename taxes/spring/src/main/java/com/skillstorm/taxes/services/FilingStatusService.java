package com.skillstorm.taxes.services;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.skillstorm.taxes.models.FilingStatus;
import com.skillstorm.taxes.repositories.FilingStatusRepository;

@Service
public class FilingStatusService {

	private FilingStatusRepository repo;
	
	public FilingStatusService(FilingStatusRepository repo) {
		this.repo = repo;
	}
	
	// find all
		public ResponseEntity<Iterable<FilingStatus>> findAll(String startsWith) { 
			
			Iterable<FilingStatus> filing_status;
			
			try {
				if (startsWith == null)
					filing_status = repo.findAll();
				else
					filing_status = repo.findByFilingStartingWith(startsWith);
				
				if (!filing_status.iterator().hasNext()) {
					return ResponseEntity.status(HttpStatus.NO_CONTENT).body(filing_status);
				} else {
					return ResponseEntity.ok(filing_status);
				}
			} catch (Exception e) {
				return ResponseEntity.status(500).build();
			}
		}
		
		// find by id
		public ResponseEntity<FilingStatus> findById(int id) {
			Optional<FilingStatus> filing_status = repo.findById(id);
			
			try {
				if (filing_status.isEmpty())
					return ResponseEntity.notFound().build();
				
				return ResponseEntity.ok(filing_status.get());
			} catch (Exception e) {
				return ResponseEntity.status(500).build();
			}
			
		}
		

}
