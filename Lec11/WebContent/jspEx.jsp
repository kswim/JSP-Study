<%@ page language="java" contentType="text/html; charset=EUC-KR" 
	pageEncoding="EUC-KR"%> 
<%@ page errorPage="errorPage.jsp" %>
<!DOCTYPE html> 
<html> 
	<head> 
		<meta charset="EUC-KR"> 
		<title>jspEx</title>
	</head>
	<body>
	<%!
	String adminId;
	String imgDir;
	
	String str;
	%>
	<%
	adminId = getServletConfig().getInitParameter("adminId"); 
	//config 객체를 통해서 web.xml에서 등록한 init-param을 가져올 수 있다.
	imgDir = getServletContext().getInitParameter("imgDir");
	//application 객체를 통해 web.xml에서 모든 서블릿에서 공유할 수 있는 context-param을 가져올 수 있다.
	%>
	
	<%
	application.setAttribute("ConnectedIP", "127.0.0.1");
	//application 객체를 통해서 속성을 저장할 수 있다.
	%>
	
	<%
	out.print("<h1>hello world!</h1>");
	//out객체를 통해서 html 출력을 할 수 있다.
	%>

	<p>adminId: <%=adminId %></p>
	<p>imgDir: <%=imgDir %></p>
	
	<%
	out.print(str.toString());
	%>
	
	</body> 
</html>