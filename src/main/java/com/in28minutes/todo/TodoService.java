package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
//	static {
//		todos.add(new Todo("Learn Web Application Development!","Java"));
//		todos.add(new Todo("Learn Spring MVC!","Spring"));
//		todos.add(new Todo("Learn Spring Rest Services!","Spring Boot"));
//	}
	public void addNewTodo(Todo newTodo) {
		todos.add(newTodo);
	}
	public List<Todo> retrieveTodos(){
		return todos;
	}
	public void deleteTodo(Todo deleteTodo) {
		todos.remove(deleteTodo);
		Todo.count=0;
		
		
	}
}
