package com.max.login.Entities;

import org.springframework.data.mongodb.core.mapping.Document;

import com.max.login.Utils.Constants.AppConstants;

@Document(collection = AppConstants.COLLECTION_STATION_DETAILS)
public class Station {
	
	private String id;
	private String stationName;
	private String zones;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the stationName
	 */
	public String getStationName() {
		return stationName;
	}
	/**
	 * @param stationName the stationName to set
	 */
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	/**
	 * @return the zones
	 */
	public String getZones() {
		return zones;
	}
	/**
	 * @param zones the zones to set
	 */
	public void setZones(String zones) {
		this.zones = zones;
	}
	
	
}
