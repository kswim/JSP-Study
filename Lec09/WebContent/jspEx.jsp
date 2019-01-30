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
	
		<!-- HTML 주석 -->
		<%-- JSP 주석 --%>
			
		<!-- 선언 태그 -->
		<%!
		int num=10;
		public void jspMethod(){
			System.out.println("----- jsp method() -----");
		}
		%>
		
		<!-- 스크립틀릿 태그 -->
		<% if(num > 0){ 
		%>	<p> num > 0 </p>
		<% } else {
		%>	<p> num <= 0 </p>
		<% }
		%>
		
		<!-- 표현식 태그 -->
		num is <%= num %>
				
	</body> 
</html>