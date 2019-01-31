<%@ page language="java" contentType="text/html; charset=EUC-KR" 
	pageEncoding="EUC-KR"%> 
<!DOCTYPE html> 
<html> 
	<head> 
		<meta charset="EUC-KR"> 
		<title>First Page</title>
	</head> 
	<body>
		<p>First Page!!!</p>
		<% response.sendRedirect("SecondPage.jsp"); %>
	</body> 
</html>