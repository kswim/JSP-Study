<%@ page language="java" contentType="text/html; charset=EUC-KR" 
	pageEncoding="EUC-KR"%> 
<!DOCTYPE html> 
<html> 
	<head> 
		<meta charset="EUC-KR"> 
		<title>JSP Example</title>
	</head> 
	<body>
		<%@ include file="header.jsp" %>
	
		<!-- HTML �ּ� -->
		<%-- JSP �ּ� --%>
			
		<!-- ���� �±� -->
		<%!
		int num=10;
		public void jspMethod(){
			System.out.println("----- jsp method() -----");
		}
		%>
		
		<!-- ��ũ��Ʋ�� �±� -->
		<% if(num > 0){ 
		%>	<p> num > 0 </p>
		<% } else {
		%>	<p> num <= 0 </p>
		<% }
		%>
		
		<!-- ǥ���� �±� -->
		num is <%= num %>
				
	</body> 
</html>