package com.max.login.Services;

import java.util.List;

import com.max.login.Entities.Card;;

public interface CardServices {
	
	List<Card> getCardList();

	void deleteCardByNumber(String cardNum);
	void deleteCardById(String cardId);

	Card addCard(Card newCard);
	
	Card updateCard(Card newCard);
}
