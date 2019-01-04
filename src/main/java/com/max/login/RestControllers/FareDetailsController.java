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

import com.max.login.Entities.FaresDetails;
import com.max.login.Services.FaresServices;
import com.max.login.Utils.Constants.AppConstants;

import io.swagger.annotations.ApiOperation;

@RestController
public class FareDetailsController {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(FareDetailsController.class);
	
	@Autowired
	FaresServices fareServices;
	
	@CrossOrigin(methods = RequestMethod.GET)
	@ApiOperation(value = "get List", notes = "get all")
	@GetMapping(value = "/fareList", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FaresDetails> getFaresList() {
		List<FaresDetails> fareList = null;
		try {
			fareList = fareServices.getFaresList();
		} catch (Exception e) {
			LOGGER.error("Fail");
		}
		
		return fareList;
	}
	
	@CrossOrigin(methods = RequestMethod.POST)
	@ApiOperation(value = "All", notes = "Add new")
	@PostMapping(value = "/addFare", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public FaresDetails addFare(@RequestBody FaresDetails newDetail) {
		FaresDetails newFare = null;
		try {			
			// System.out.println(todoList);
			newFare = fareServices.addFare(newDetail);
		} catch (Exception e) {
			LOGGER.error("Fail");
		}
		return newFare;
	}
	
	@CrossOrigin(methods = RequestMethod.POST)
	@ApiOperation(value = "All", notes = "update")
	@PostMapping(value = "/updateFare", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public FaresDetails addUpdateFare(@RequestBody FaresDetails updatedDetail) {
		FaresDetails newStation = null;
		try {			
			// System.out.println(todoList);
			newStation = fareServices.updateFare(updatedDetail);
		} catch (Exception e) {
			LOGGER.error("Fail");
		}
		return newStation;
	}
	
	@CrossOrigin(methods = RequestMethod.DELETE)
	@ApiOperation(value = "Delete ", notes = "Delete Existing")
	@DeleteMapping(value = "/deleteFare")
	public String deleteFare(@RequestParam String id) {
		LOGGER.info("Login API:  Login For UserName : " + id);
		try {
			
		} catch (Exception e) {
			LOGGER.error("FAIL");
		}
		fareServices.deleteFareById(id);
		return AppConstants.SUCCESS;
	}
	
	
}
