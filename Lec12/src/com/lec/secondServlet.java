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
		//config ��ü�� ���ؼ� �ʱ� �Ķ���ͷ� �־��� ���� ������ �� �ִ�.
		String adminPw = getInitParameter("adminPw");
		//httpServlet�� ��ӹ��� GenericServlet���� getInitParameter �޼ҵ带 ������ �־ �ٷ� ȣ���� �� �ִ�.
		
		PrintWriter out = response.getWriter();
		out.print("<p>adminId: "+adminId+"</p>");
		out.print("<p>adminPw: "+adminPw+"</p>");
		
		String connectedIP = (String)getServletContext().getAttribute("ConnectedIP");
		out.print("ConnectedIP: " + connectedIP + "<br>");
		//context ��ü�� �Ӽ����� ������ ���� �ٸ� �������� �����ͼ� ����� �� �ִ�.
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
