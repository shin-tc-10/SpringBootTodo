package com.example.sbTodo.web.todo;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class TodoForm {


	private long id;

	@Length(min=1, max=100 )
	private String task;

	@Length(min=1, max=300 )
	private String detail;
}
