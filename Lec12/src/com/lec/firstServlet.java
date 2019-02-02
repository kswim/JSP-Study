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
		//config ��ü�� ���� ������ ����� ����� �ʱ� �Ķ���͸� �����ͼ� ����� �� �ִ�.
		
		PrintWriter out = response.getWriter();
		out.print("<p>adminId: "+adminId+"</p>");
		out.print("<p>adminPw: "+adminPw+"</p>");
		
		String imgDir = (String)getServletContext().getInitParameter("imgDir");
		//context-param�� ���� ����� �Ķ���͸� ��� �������� ������ ����� �� �ִ�.
		
		out.print("imgDir: "+imgDir+"<br>");
	
		getServletContext().setAttribute("ConnectedIP", "127.0.0.1");
		//context ��ü�� ���ؼ� �Ӽ��� ������ �� �ִ�.
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
