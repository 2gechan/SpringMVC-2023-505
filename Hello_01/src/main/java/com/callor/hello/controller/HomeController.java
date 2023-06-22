package com.callor.hello.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Hello HomeController");
		
		// name 이라는 변수를 만들고 홍길동이라는 value 를 세팅
		request.setAttribute("name", "홍길동");
		
		// hello.jsp에게 request 보내주고 response 받아온다. 
		request.getRequestDispatcher("/WEB-INF/views/hello.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
