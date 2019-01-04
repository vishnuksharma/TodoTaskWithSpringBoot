package com.max.login.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.max.login.Entities.Card;

@Repository
public interface CardRepositories extends MongoRepository<Card, String> {
	
	public Card findByCardNumber(String cardNumber);
	
	public Card findById(String id);
	
	public Card deleteById(int id);
	
	
}
