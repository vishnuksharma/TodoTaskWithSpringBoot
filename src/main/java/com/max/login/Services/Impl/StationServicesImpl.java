package com.max.login.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.max.login.Entities.Station;
import com.max.login.Repositories.StationRepository;
import com.max.login.Services.StationServices;

@Service
public class StationServicesImpl implements StationServices{

	@Autowired
	StationRepository stationRepository;
	
	@Override
	public List<Station> getStationList() {
		return stationRepository.findAll();
	}

	@Override
	public void deleteStationById(String id) {
		Station findById = stationRepository.findById(id);
		stationRepository.delete(findById);
	}

	@Override
	public Station addStation(Station newStation) {
		return stationRepository.insert(newStation);
	}

	@Override
	public Station updateStation(Station updateStation) {
		return stationRepository.save(updateStation);
	}

}
