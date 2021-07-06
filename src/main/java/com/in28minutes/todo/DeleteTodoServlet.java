package com.in28minutes.todo;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet{
	private TodoService todoService = new TodoService();
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		
		System.out.println("In Step 1.");
		String deleteTodo = request.getParameter("name");
		String category = request.getParameter("category");
		String date = request.getParameter("");
		todoService.deleteTodo(new Todo(deleteTodo,category,date));
		
		request.setAttribute("todos",todoService.retrieveTodos());
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request,response);
	}
}