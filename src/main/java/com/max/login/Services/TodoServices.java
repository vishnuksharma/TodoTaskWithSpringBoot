package com.max.login.Services;

import java.util.List;

import com.max.login.Entities.TodoTask;

public interface TodoServices {

	List<TodoTask> getTodoTaskList();

	void deleteTodoTask(String taskId);

	TodoTask addTodoTask(TodoTask newTask);
	
	TodoTask updateTask(TodoTask newTask);

}
