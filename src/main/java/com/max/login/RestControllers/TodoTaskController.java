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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.max.login.Entities.TodoTask;
import com.max.login.Services.TodoServices;
import com.max.login.Utils.Constants.AppConstants;

import io.swagger.annotations.ApiOperation;

@RestController
public class TodoTaskController {
	
private static final Logger logger = LoggerFactory.getLogger(TodoTaskController.class);
	
	@Autowired
	private TodoServices igtServices;
	
	@CrossOrigin(methods = RequestMethod.GET)
	@ApiOperation(value = "get Task List", notes = "get all todo task")
	@GetMapping(value = "/todoList", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TodoTask> getTodoTaskList() {

		List<TodoTask> todoList = null;
		todoList = igtServices.getTodoTaskList();
		return todoList;
	}
	
	@CrossOrigin(methods = RequestMethod.POST)
	@ApiOperation(value = "All Task", notes = "Add new task")
	@PostMapping(value = "/addTask", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public TodoTask addTodoTask(@RequestBody TodoTask todoTask) {

		TodoTask newTask = null;
		// System.out.println(todoList);
		newTask = igtServices.addTodoTask(todoTask);
		return newTask;
	}
	
	@CrossOrigin(methods = RequestMethod.POST)
	@ApiOperation(value = "All Task", notes = "Add new task")
	@PostMapping(value = "/updateTask", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public TodoTask updateTodoTask(@RequestBody TodoTask todoTask) {

		TodoTask newTask = null;
		logger.info("Task Id : " + todoTask.getId());
		// System.out.println(todoList);
		newTask = igtServices.updateTask(todoTask);
		return newTask;
	}
	
	@CrossOrigin(methods = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Task ", notes = "Delete Existing Task")
	@DeleteMapping(value = "/deleteTask")
	public String deleteTodoTask(@RequestParam String taskId) {
		logger.info("Login API:  Login For UserName : " + taskId);
		igtServices.deleteTodoTask(taskId);
		return AppConstants.SUCCESS;
	}
}
