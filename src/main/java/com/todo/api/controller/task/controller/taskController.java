package com.todo.api.controller.task.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.todo.api.controller.TasksApi;
import com.todo.api.controller.task.service.TaskEntity;
import com.todo.api.controller.task.service.TaskService;
import com.todo.api.model.TaskDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class taskController implements TasksApi {
	
	private final TaskService taskService;

	@Override
	public ResponseEntity<TaskDTO> showTask(Long taskId) {
		TaskEntity entity = taskService.find(taskId);
		TaskDTO dto = new TaskDTO();
		dto.setId(entity.getId());
		dto.setTitle(entity.getTitle());
		return ResponseEntity.ok(dto);
	}	
}
