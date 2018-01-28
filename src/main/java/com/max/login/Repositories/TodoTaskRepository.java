package com.max.login.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.max.login.Entities.TodoTask;

import java.lang.String;
import java.util.List;

/**
 * The LoginUserRepository for fetching the LoginUser.
 */
@Repository
public interface TodoTaskRepository extends MongoRepository<TodoTask, String> {
	
	/**
	 * Find by user name.
	 *
	 * @param username - userName 
	 * @return the list of valid users
	 */
	public List<TodoTask> findByName(String name);
	
	
	public TodoTask deleteById(int id);
	
	public TodoTask findById(String taskId);
	
}
