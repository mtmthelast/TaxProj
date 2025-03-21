package com.skillstorm.taxes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.skillstorm.taxes.models.EmploymentSector;

@Repository
public interface EmploymentSectorRepository extends CrudRepository<EmploymentSector, Integer> {
	
	Iterable<EmploymentSector> findByEmploymentSecStartingWith(String startsWith);

}
