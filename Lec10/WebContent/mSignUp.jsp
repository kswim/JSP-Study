<%@ page language="java" contentType="text/html; charset=EUC-KR" 
	pageEncoding="EUC-KR"%> 
<!DOCTYPE html> 
<html> 
	<head> 
		<meta charset="EUC-KR"> 
		<title>SignUp OK</title>
	</head> 
	<body>
	
		<%!
		String m_name;
		String m_pass;
		String m_gender;
		String[] m_hobbys;
		String m_residence;
		%>
		
		<%
		request. setCharacterEncoding("EUC-KR");
		//request 객체를 디코딩할 때의 charset을 정해줄 수 있다. 한글깨지는 것을 방지!

		m_name = request.getParameter("m_name");
		m_pass = request.getParameter("m_pass");
		m_gender = request.getParameter("m_gender");
		m_hobbys = request.getParameterValues("m_bobby");
		m_residence = request.getParameter("m_residence");
		%>
		
		<p> 사용자 정보 </p>
		name: <%=m_name %> <br>
		password: <%=m_pass %> <br>
		gender: <%=m_gender %> <br>
		hobby:
		<%
		for(int i=0; i<m_hobbys.length; i++){
		%> 
		<%= m_hobbys[i] %> 
		<%
		}
		%>
		<br>
		residence: <%=m_residence %><br>

	</body> 
</html>