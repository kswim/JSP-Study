package com.lec;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//annotation을 통해서 Servlet mapping을 해줄 수 있다. 이 프로젝트에서는 web.xml에 등록된 것 포함 /HS, /HS1, /HS2 으로 이 Servlet을 매핑한다.
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
