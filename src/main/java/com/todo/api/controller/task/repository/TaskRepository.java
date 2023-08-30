package com.todo.api.controller.task.repository;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TaskRepository {

	@Select("SELECT * FROM tasks WHERE id = ${taskId}")
	Optional<TaskRecord> select(Long taskId);

}
