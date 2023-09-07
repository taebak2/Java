<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="common.Car"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Map<Integer, Car> maps = new HashMap<>();
	maps.put(1, new Car("Benz", "White", 200000000));
	maps.put(2, new Car("BMW", "Blue", 100000000));
	application.setAttribute("car", maps); // cars라는 변수명에 maps값 저장
	%>
	<h2>application속성이 저장되었습니다.</h2>
</body>
</html>