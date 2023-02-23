package com.example.sbTodo.web.todo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class TodoForm {

	private long id;

	private String task;

	private String detail;
}
