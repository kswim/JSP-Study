package com.lec;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mSignUp")
public class memSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public memSignUp() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("----- doGet() -----");
		
		String m_name = request.getParameter("m_name");
		String m_pass = request.getParameter("m_pass");
		String gender = request.getParameter("m_gender");
		String[] hobbys = request.getParameterValues("m_bobby");
		String residence = request.getParameter("m_residence");
		
		System.out.println("m_name : " + m_name);
		System.out.println("m_pass : " + m_pass);
		System.out.println("m_gender : " + gender);
		System.out.println("m_hobbys : " + Arrays.toString(hobbys));
		System.out.println("m_residence : " + residence);
		
		Enumeration<String> names = request.getParameterNames();
		
		while (names.hasMoreElements()) {
			String name = (String) names.nextElement();
			System.out.println("name : " + name);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("----- doPost() -----");
		doGet(request, response);
	}

}
