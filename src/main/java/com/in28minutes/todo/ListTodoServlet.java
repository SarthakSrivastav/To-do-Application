package com.in28minutes.todo;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/list-todo.do")
public class ListTodoServlet extends HttpServlet{
	private TodoService todoService = new TodoService();
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		
//		LocalDate date = LocalDate.now(); // Create a date object
//		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
//		String formattedDate = date.format(myFormatObj); 
//	    System.out.println("This is ListTodoServlet class: "+formattedDate); //Display the current date
	    
		request.setAttribute("todos",todoService.retrieveTodos());
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request,response);
	}
}