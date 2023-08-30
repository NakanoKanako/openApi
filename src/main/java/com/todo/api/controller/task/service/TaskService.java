package com.todo.api.controller.task.service;

import org.springframework.stereotype.Service;

import com.todo.api.controller.task.TaskEntityNotFoundException;
import com.todo.api.controller.task.repository.TaskRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskService {
	
	private final TaskRepository taskRepository;

	public TaskEntity find(Long taskId) {
		return taskRepository.select(taskId).map(record -> new TaskEntity(record.getId(), record.getTitle()))
		.orElseThrow(() -> new TaskEntityNotFoundException(taskId));	
	}
}
