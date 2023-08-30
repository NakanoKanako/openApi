package com.todo.api.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.todo.api.controller.task.TaskEntityNotFoundException;
import com.todo.api.model.ResourseNotFoundError;

@RestControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(TaskEntityNotFoundException.class)
	public ResponseEntity<ResourseNotFoundError> handleTaskEntityNotFoundException(TaskEntityNotFoundException e){
		var error = new ResourseNotFoundError();
		error.setDetail(e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	};

}
