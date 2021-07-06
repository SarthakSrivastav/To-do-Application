package com.in28minutes.login;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.login.*;
import com.in28minutes.todo.TodoService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlets extends HttpServlet{
	private TodoService todoService = new TodoService();
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		System.out.println("In doGet going to call login.jsp page");
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
		System.out.println("login.jsp page is called");
		
	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		System.out.println("In doPost going to call welcome.jsp");
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		LoginService obj = new LoginService();
		boolean result = obj.isUserValid(name, pass);
		    
		if(result) {
 			request.getSession().setAttribute("name", name);
			request.getSession().setAttribute("pass", pass);
			response.sendRedirect("/list-todo.do");
		}
		else {
			request.setAttribute("errorMessage", "Invalid credentials!!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
		}
		
		System.out.println("End of doPost");
	}
}