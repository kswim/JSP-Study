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
	//config ��ü�� ���ؼ� web.xml���� ����� init-param�� ������ �� �ִ�.
	imgDir = getServletContext().getInitParameter("imgDir");
	//application ��ü�� ���� web.xml���� ��� �������� ������ �� �ִ� context-param�� ������ �� �ִ�.
	%>
	
	<%
	application.setAttribute("ConnectedIP", "127.0.0.1");
	//application ��ü�� ���ؼ� �Ӽ��� ������ �� �ִ�.
	%>
	
	<%
	out.print("<h1>hello world!</h1>");
	//out��ü�� ���ؼ� html ����� �� �� �ִ�.
	%>

	<p>adminId: <%=adminId %></p>
	<p>imgDir: <%=imgDir %></p>
	
	<%
	out.print(str.toString());
	%>
	
	</body> 
</html>