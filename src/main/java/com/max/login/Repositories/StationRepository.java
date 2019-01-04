package com.max.login.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.max.login.Entities.Station;

@Repository
public interface StationRepository extends MongoRepository<Station, String> {
		
	public Station findById(String id);
	
	public Station findByStationName(String name);
	
	public Station deleteById(int id);
}
