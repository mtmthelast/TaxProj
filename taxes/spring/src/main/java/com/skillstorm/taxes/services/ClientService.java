package com.skillstorm.taxes.services;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.skillstorm.taxes.dtos.ClientDTO;
import com.skillstorm.taxes.models.Client;
import com.skillstorm.taxes.repositories.ClientRepository;

@Service
public class ClientService {
	@Value("${base-url}")
	private String baseURL;
	
	
	private ClientRepository repo;
	
	public ClientService(ClientRepository repo) {
		this.repo = repo;
}
	// find all
			public ResponseEntity<Iterable<Client>> findAll(String startsWith) { 
				
				Iterable<Client> clients;
				
				try {
					if (startsWith == null)
						clients = repo.findAll();
					else
						clients = repo.findByClientStartingWith(startsWith);
					
					if (!clients.iterator().hasNext()) {
						return ResponseEntity.status(HttpStatus.NO_CONTENT).body(clients);
					} else {
						return ResponseEntity.ok(clients);
					}
				} catch (Exception e) {
					return ResponseEntity.status(500).build();
				}
			}
			
			// find by id
			public ResponseEntity<Client> findById(int social_security_number) {
				Optional<Client> client = repo.findById(social_security_number);
				
				try {
					if (client.isEmpty())
						return ResponseEntity.notFound().build();
					
					return ResponseEntity.ok(client.get());
				} catch (Exception e) {
					return ResponseEntity.status(500).build();
				}
				
			}
			
			// create one
			public ResponseEntity<Client> createOne(ClientDTO dto) {
				try {
					 Client saved = repo.save(new Client(dto.social_security_number(), dto.first_name(), dto.last_name(), dto.employee_id1(), dto.date_of_birth(), dto.street_address(), dto.city(), dto.state(), dto.adjusted_gross_income(), dto.withheld_income_tax(), dto.tax_return(), dto.employment_sect(), dto.filing_stat()));
					 return ResponseEntity.created(new URI(this.baseURL + "client/" + saved.getSocial_security_number())).body(saved);
					 
				} catch (Exception e) {
					return ResponseEntity.status(500).build();
				}
			}
			
			// update one
			public ResponseEntity<Client> updateOne(int social_security_number, ClientDTO dto) { 
				try {
					if (repo.existsById(social_security_number))
						return ResponseEntity.ok(repo.save(new Client(dto.social_security_number(), dto.first_name(), dto.last_name(), dto.employee_id1(), dto.date_of_birth(), dto.street_address(), dto.city(), dto.state(), dto.adjusted_gross_income(), dto.withheld_income_tax(), dto.tax_return(), dto.employment_sect(), dto.filing_stat())));
					return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
				} catch (Exception e) {
					return ResponseEntity.status(500).build();
				}
			}
			
			// delete one
			public ResponseEntity<Void> deleteById(int social_security_number) {
				try {
					repo.deleteById(social_security_number);
					return ResponseEntity.noContent().build();
				} catch (Exception e) {
					return ResponseEntity.status(500).build();
				}
			}


}
