package com.max.login.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.max.login.Entities.Card;
import com.max.login.Repositories.CardRepositories;
import com.max.login.Services.CardServices;

@Service
public class CardServicesImpl implements CardServices{

	@Autowired
	CardRepositories cardRepositories;
	
	@Override
	public List<Card> getCardList() {
		return cardRepositories.findAll();
	}

	@Override
	public void deleteCardByNumber(String cardNum) {
		Card findByCardNumber = cardRepositories.findByCardNumber(cardNum);
		System.out.println(findByCardNumber.getCardName());
		cardRepositories.delete(findByCardNumber);
		
	}

	@Override
	public void deleteCardById(String cardId) {
		Card findById = cardRepositories.findById(cardId);
		System.out.println(findById.getCardName());
		cardRepositories.delete(findById);		
	}

	@Override
	public Card addCard(Card newCard) {
		return cardRepositories.insert(newCard);
	}

	@Override
	public Card updateCard(Card newCard) {
		return cardRepositories.save(newCard);
	}
	
}
