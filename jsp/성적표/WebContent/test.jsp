<%@page import="db.testDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import = db.testDTO %>
<%
	String classNum = request.getParameter("classNum"); 
	int Kor = Integer.parseInt(request.getParameter("Kor"));
	int Eng = Integer.parseInt(request.getParameter("Eng"));
	int Math = Integer.parseInt(request.getParameter("Math"));
	
	testDAO dao = new testDAO();
	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>