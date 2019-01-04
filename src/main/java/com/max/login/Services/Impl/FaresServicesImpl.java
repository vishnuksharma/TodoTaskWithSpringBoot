package com.max.login.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.max.login.Entities.FaresDetails;
import com.max.login.Repositories.FaresRepository;
import com.max.login.Services.FaresServices;

@Service
public class FaresServicesImpl implements FaresServices{

	@Autowired
	FaresRepository faresRepository;
	
	
	@Override
	public List<FaresDetails> getFaresList() {
		return faresRepository.findAll();
	}

	@Override
	public void deleteFareById(String id) {
		FaresDetails findById = faresRepository.findById(id);
		System.out.println(findById.getZone());
		faresRepository.delete(findById);
	}

	@Override
	public FaresDetails addFare(FaresDetails newFare) {
		return faresRepository.insert(newFare);
	}

	@Override
	public FaresDetails updateFare(FaresDetails updateFare) {
		return faresRepository.save(updateFare);
	}

}
