package com.lec;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firstServlet")
public class firstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminId = getServletConfig().getInitParameter("adminId");
		String adminPw = getServletConfig().getInitParameter("adminPw");
		//config 객체를 통해 서블릿을 등록할 당시의 초기 파라매터를 가져와서 사용할 수 있다.
		
		PrintWriter out = response.getWriter();
		out.print("<p>adminId: "+adminId+"</p>");
		out.print("<p>adminPw: "+adminPw+"</p>");
		
		String imgDir = (String)getServletContext().getInitParameter("imgDir");
		//context-param을 통해 등록한 파라매터를 모든 서블릿에서 가져와 사용할 수 있다.
		
		out.print("imgDir: "+imgDir+"<br>");
	
		getServletContext().setAttribute("ConnectedIP", "127.0.0.1");
		//context 객체를 통해서 속성을 저장할 수 있다.
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
