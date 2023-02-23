package com.example.sbTodo.web.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.sbTodo.domain.todo.TodoService;

@Controller
public class TodoController {

	@Autowired
	TodoService todoService;

	@Autowired
	TodoForm todoForm;

	@RequestMapping("/list")
	public String list() {
		return "todos/list";
	}

	@RequestMapping("/create")
	public String create(Model model) {

		model.addAttribute("todoForm", todoForm);
		return "todos/create";
	}

	@RequestMapping("/createForm")
	public String createForm(@ModelAttribute TodoForm model) {

		todoService.create(model.getTask(), model.getDetail());
		return "todos/create";
	}
}
