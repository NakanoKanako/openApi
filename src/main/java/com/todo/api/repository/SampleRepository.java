package com.todo.api.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SampleRepository {
	
	@Select("SELECT content FROM samples ORDER BY id ")
	public SampleRecord select();

}
