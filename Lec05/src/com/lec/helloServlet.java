package com.lec;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//annotation�� ���ؼ� Servlet mapping�� ���� �� �ִ�. �� ������Ʈ������ web.xml�� ��ϵ� �� ���� /HS, /HS1, /HS2 ���� �� Servlet�� �����Ѵ�.
@WebServlet(name="/HS", urlPatterns= {"/HS1", "/HS2"})
public class helloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public helloServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("Hello Servlet!!!");
		out.print("</body>");
		out.print("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
