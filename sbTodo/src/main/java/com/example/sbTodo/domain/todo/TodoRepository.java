package com.example.sbTodo.domain.todo;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public class TodoRepository {

	@Select("SELECT * FROM TODOS")
	List<TodoEntity> selectAll();

	@Insert("INSERT INTO TODOS(TASK, DETAIL)VALUES(#{TASK}, #{DETAIL}))")
	void insert(String task, String detail);

	@Select("SELECT * FROM TODOS WHERE ID = #{todoId}")
	TodoEntity selectById(long id);
}
