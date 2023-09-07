<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="common.Person"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Person value = (Person)(request.getAttribute("requestPerson"));
	%>
	<ul>
		<li>Person 객체 값 : <%=value.getName()%></li>
	</ul>

</body>
</html>