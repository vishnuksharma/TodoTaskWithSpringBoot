package com.max.login.Entities;

import org.springframework.data.mongodb.core.mapping.Document;

import com.max.login.Utils.Constants.AppConstants;

@Document(collection = AppConstants.COLLECTION_CARD_DETAILS)
public class Card {
	private String id;
	private String cardName;
	private String cardNumber;
	private int cardMoney;
	private String cardStatus;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * @return the cardName
	 */
	public String getCardName() {
		return cardName;
	}
	/**
	 * @param cardName the cardName to set
	 */
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}
	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	/**
	 * @return the cardMoney
	 */
	public int getCardMoney() {
		return cardMoney;
	}
	/**
	 * @param cardMoney the cardMoney to set
	 */
	public void setCardMoney(int cardMoney) {
		this.cardMoney = cardMoney;
	}
	/**
	 * @return the cardStatus
	 */
	public String getCardStatus() {
		return cardStatus;
	}
	/**
	 * @param cardStatus the cardStatus to set
	 */
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}
	
	
}
