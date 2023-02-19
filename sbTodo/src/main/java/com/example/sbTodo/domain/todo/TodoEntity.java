package com.example.sbTodo.domain.todo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class TodoEntity {

	private int id;
	private String task;
	private String detail;
}
