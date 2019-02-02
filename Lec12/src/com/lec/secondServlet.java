package com.lec;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/secondServlet")
public class secondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminId = getServletConfig().getInitParameter("adminId");
		//config 객체를 통해서 초기 파라매터로 넣어준 값을 가져올 수 있다.
		String adminPw = getInitParameter("adminPw");
		//httpServlet이 상속받은 GenericServlet에서 getInitParameter 메소드를 가지고 있어서 바로 호출할 수 있다.
		
		PrintWriter out = response.getWriter();
		out.print("<p>adminId: "+adminId+"</p>");
		out.print("<p>adminPw: "+adminPw+"</p>");
		
		String connectedIP = (String)getServletContext().getAttribute("ConnectedIP");
		out.print("ConnectedIP: " + connectedIP + "<br>");
		//context 객체의 속성으로 저장한 값을 다른 서블릿에서 가져와서 사용할 수 있다.
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
