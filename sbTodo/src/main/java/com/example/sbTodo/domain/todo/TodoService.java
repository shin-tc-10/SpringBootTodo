package com.example.sbTodo.domain.todo;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class TodoService {

	private final TodoRepository todoRepository;

	public List<TodoEntity> selectAll() {
	    return todoRepository.selectAll();
	}

	@Transactional
	public void create(String task, String detail) {
	    todoRepository.insert(task, detail);

	}

	public TodoEntity selectById(long id) {
	return todoRepository.selectById(id);
	}
}
