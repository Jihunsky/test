package com.human.hub.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.
import javax.servlet.http.HttpServlet;

import javax.servlet.http.*;



@WebServlet("/main.ghub")
public class MainController extends HttpServlet throws ServletException, IOException {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/main.jsp");
			
		rd.forward(req, resp);
	}
}
