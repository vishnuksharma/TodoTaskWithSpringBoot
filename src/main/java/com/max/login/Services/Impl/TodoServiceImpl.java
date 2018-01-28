package com.max.login.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.max.login.Entities.TodoTask;
import com.max.login.Repositories.TodoTaskRepository;
import com.max.login.Services.TodoServices;

@Service
public class TodoServiceImpl implements TodoServices {
	
	@Autowired
	TodoTaskRepository todoRepository;
	
	@Override
	public List<TodoTask> getTodoTaskList() {
		return todoRepository.findAll();
	}

	@Override
	public void deleteTodoTask(String taskId) {
		TodoTask findById = todoRepository.findById(taskId);
		System.out.println(findById.getName());
		todoRepository.delete(findById);
		
	}

	@Override
	public TodoTask addTodoTask(TodoTask newTask) {
		return todoRepository.insert(newTask);
	}

	@Override
	public TodoTask updateTask(TodoTask newTask) {
		return todoRepository.save(newTask);
	}

}
