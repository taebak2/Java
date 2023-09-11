<%@page import="common.JDBConnect2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> JDBC 테스트</h2>
	<%
		JDBConnect2 jdbc1 = new JDBConnect2();
		jdbc1.close();	
	%>
	

	
	
</body>
</html>