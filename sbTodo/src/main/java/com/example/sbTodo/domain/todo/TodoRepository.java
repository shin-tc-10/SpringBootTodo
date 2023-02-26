package com.example.sbTodo.domain.todo;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TodoRepository {

	@Select("SELECT * FROM TODOS")
	List<TodoEntity> selectAll();

	@Insert("INSERT INTO todos(task, detail)VALUES(#{task}, #{detail})")
	void insert(@Param("task") String task, @Param("detail") String detail);

	@Select("SELECT * FROM TODOS WHERE ID = #{todoId}")
	TodoEntity selectById(long id);
}
