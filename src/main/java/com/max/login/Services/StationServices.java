package com.max.login.Services;

import java.util.List;

import com.max.login.Entities.Station;;

public interface StationServices {
	
	List<Station> getStationList();

	void deleteStationById(String cardId);

	Station addStation(Station newStation);
	
	Station updateStation(Station updateStation);
}
