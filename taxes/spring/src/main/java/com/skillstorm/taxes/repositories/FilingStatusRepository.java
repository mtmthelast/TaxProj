package com.skillstorm.taxes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.taxes.models.FilingStatus;

@Repository
public interface FilingStatusRepository extends CrudRepository<FilingStatus, Integer>{
	
	Iterable<FilingStatus> findByFilingStartingWith(String startsWith);

}
