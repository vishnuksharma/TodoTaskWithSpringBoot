package com.max.login.Services;

import java.util.List;

import com.max.login.Entities.FaresDetails;;

public interface FaresServices {
	
	List<FaresDetails> getFaresList();

	void deleteFareById(String id);

	FaresDetails addFare(FaresDetails newFare);
	
	FaresDetails updateFare(FaresDetails updateFare);
}
