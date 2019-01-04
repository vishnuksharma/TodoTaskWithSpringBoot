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

import com.max.login.Entities.Card;
import com.max.login.Services.CardServices;
import com.max.login.Utils.Constants.AppConstants;

import io.swagger.annotations.ApiOperation;

@RestController
public class CardController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CardController.class);

	@Autowired
	CardServices cardServices;

	@CrossOrigin(methods = RequestMethod.GET)
	@ApiOperation(value = "get card List", notes = "get all card")
	@GetMapping(value = "/cardList", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Card> getCardList() {
		List<Card> cardList = null;
		try {
			cardList = cardServices.getCardList();
		} catch (Exception e) {
			LOGGER.error("Fail");
		}
		
		return cardList;
	}
	
	@CrossOrigin(methods = RequestMethod.POST)
	@ApiOperation(value = "All Card", notes = "Add new card")
	@PostMapping(value = "/addCard", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Card addCard(@RequestBody Card newCardDetail) {
		Card newCard = null;
		try {			
			// System.out.println(todoList);
			newCard = cardServices.addCard(newCardDetail);
		} catch (Exception e) {
			LOGGER.error("Fail");
		}
		return newCard;
	}
	
	@CrossOrigin(methods = RequestMethod.POST)
	@ApiOperation(value = "All Card", notes = "Add new card")
	@PostMapping(value = "/updateCard", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Card addUpdateCard(@RequestBody Card newCardDetail) {
		Card newCard = null;
		try {			
			// System.out.println(todoList);
			newCard = cardServices.updateCard(newCardDetail);
		} catch (Exception e) {
			LOGGER.error("Fail");
		}
		return newCard;
	}
	
	@CrossOrigin(methods = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Task ", notes = "Delete Existing Task")
	@DeleteMapping(value = "/deleteCard")
	public String deleteCard(@RequestParam String cardNum) {
		LOGGER.info("Login API:  Login For UserName : " + cardNum);
		try {
			
		} catch (Exception e) {
			LOGGER.error("FAIL");
		}
		cardServices.deleteCardByNumber(cardNum);
		return AppConstants.SUCCESS;
	}

}
