package com.max.login.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.max.login.Entities.FaresDetails;

@Repository
public interface FaresRepository extends MongoRepository<FaresDetails, String>{
	
	public FaresDetails findById(String id);
	
	public FaresDetails findByZone(String zoneName);
	
}
