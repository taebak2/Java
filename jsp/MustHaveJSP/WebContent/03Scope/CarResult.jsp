<%@page import="java.util.Iterator"%>
<%@page import="javax.sql.rowset.CachedRowSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="common.Car"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>애플리케이션 영역의 속성 읽기</h2>
	<%
		Map<Integer, Car> maps = (Map<Integer, Car>) application.getAttribute("car");
		Set<Integer> keys = maps.keySet();
		Iterator<Integer> iterator = keys.iterator();

	for (int i = 0; i < keys.size(); i++) {
		Integer key = iterator.next();
		Car car = maps.get(key);
		out.println(car.getCarName() + car.getCarPrice());
	}
	%>
</body>
</html>