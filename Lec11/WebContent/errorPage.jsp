<%@ page language="java" contentType="text/html; charset=EUC-KR" 
	pageEncoding="EUC-KR"%> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html> 
<html> 
	<head> 
		<meta charset="EUC-KR"> 
		<title>Error Page</title>
	</head>
	<body>
	<%
	response.setStatus(200);
	String msg = exception.getMessage();
	%>
	
	<h1>error msg: <%=msg %></h1>
	</body> 
</html>