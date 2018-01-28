package com.max.login.Entities;

import org.springframework.data.mongodb.core.mapping.Document;

import com.max.login.Utils.Constants.AppConstants;

@Document(collection = AppConstants.COLLECTION_TODOTASK)
public class TodoTask {
	private String id;
	private String name;
	private String description;
	private String status;
	private String todoDate;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the todoDate
	 */
	public String getTodoDate() {
		return todoDate;
	}

	/**
	 * @param todoDate
	 *            the todoDate to set
	 */
	public void setTodoDate(String todoDate) {
		this.todoDate = todoDate;
	}
}
