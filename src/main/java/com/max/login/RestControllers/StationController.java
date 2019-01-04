package com.max.login.RestControllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.max.login.Entities.Station;
import com.max.login.Services.StationServices;
import com.max.login.Utils.Constants.AppConstants;

import io.swagger.annotations.ApiOperation;

@RestController
public class StationController {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(StationController.class);
	
	@Autowired
	StationServices stationServices;
	
	@CrossOrigin(methods = RequestMethod.GET)
	@ApiOperation(value = "get List", notes = "get all")
	@GetMapping(value = "/stationList", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Station> getStationList() {
		List<Station> stationList = null;
		try {
			stationList = stationServices.getStationList();
		} catch (Exception e) {
			LOGGER.error("Fail");
		}
		
		return stationList;
	}
	
	@CrossOrigin(methods = RequestMethod.POST)
	@ApiOperation(value = "All", notes = "Add new")
	@PostMapping(value = "/addStation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Station addStation(@RequestBody Station newDetail) {
		Station newStation = null;
		try {			
			// System.out.println(todoList);
			newStation = stationServices.addStation(newDetail);
		} catch (Exception e) {
			LOGGER.error("Fail");
		}
		return newStation;
	}
	
	@CrossOrigin(methods = RequestMethod.POST)
	@ApiOperation(value = "All", notes = "update")
	@PostMapping(value = "/updateStation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Station addUpdateCard(@RequestBody Station updatedDetail) {
		Station newStation = null;
		try {			
			// System.out.println(todoList);
			newStation = stationServices.updateStation(updatedDetail);
		} catch (Exception e) {
			LOGGER.error("Fail");
		}
		return newStation;
	}
	
	@CrossOrigin(methods = RequestMethod.DELETE)
	@ApiOperation(value = "Delete ", notes = "Delete Existing")
	@DeleteMapping(value = "/deleteStation")
	public String deleteStation(@RequestParam String id) {
		LOGGER.info("Login API:  Login For UserName : " + id);
		try {
			
		} catch (Exception e) {
			LOGGER.error("FAIL");
		}
		stationServices.deleteStationById(id);
		return AppConstants.SUCCESS;
	}
}
