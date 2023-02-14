package com.example.sbTodo.web.todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

	@RequestMapping("/list")
	public String list() {
		return "todos/list";
	}

	@RequestMapping("/create")
	public String create() {
		return "todos/create";
	}
}
