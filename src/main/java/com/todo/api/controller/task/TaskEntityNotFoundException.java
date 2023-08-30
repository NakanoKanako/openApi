package com.todo.api.controller.task;

public class TaskEntityNotFoundException extends RuntimeException {
	
	private long taskId;

	public TaskEntityNotFoundException(long taskId) {
		super("TaskEntity(id = " + taskId + ") is not found.");
		this.taskId = taskId;
	}
	
	

}
