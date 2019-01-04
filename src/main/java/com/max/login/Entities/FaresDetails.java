package com.max.login.Entities;

import org.springframework.data.mongodb.core.mapping.Document;

import com.max.login.Utils.Constants.AppConstants;

@Document(collection = AppConstants.COLLECTION_FARES_DETAILS)
public class FaresDetails {
	private String id;
	private String zone;
	private String fare;
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
	 * @return the zone
	 */
	public String getZone() {
		return zone;
	}
	/**
	 * @param zone the zone to set
	 */
	public void setZone(String zone) {
		this.zone = zone;
	}
	/**
	 * @return the fare
	 */
	public String getFare() {
		return fare;
	}
	/**
	 * @param fare the fare to set
	 */
	public void setFare(String fare) {
		this.fare = fare;
	}
	
	
}
