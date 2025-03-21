package com.skillstorm.taxes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.taxes.models.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer>{
	Iterable<Client> findByClientStartingWith(String startsWith);
	Iterable<Client> findBySSN(int social_security_number);
	
}
