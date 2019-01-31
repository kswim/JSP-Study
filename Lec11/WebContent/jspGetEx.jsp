<%@ page language="java" contentType="text/html; charset=EUC-KR" 
	pageEncoding="EUC-KR"%> 
<!DOCTYPE html> 
<html> 
	<head> 
		<meta charset="EUC-KR"> 
		<title>jspGetEx</title>
	</head>
	<body>
	
	<%!
	String connectedIP;
	%>
	<%
	connectedIP = (String)application.getAttribute("ConnectedIP");
	%>
	<p>connectedIP: <%=connectedIP %></p>
	
	</body> 
</html>