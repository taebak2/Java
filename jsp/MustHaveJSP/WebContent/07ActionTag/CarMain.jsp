<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = request.getParameter("carName"); 
	String color = request.getParameter("carColor");
	int price = Integer.parseInt(request.getParameter("carPrice"));
	%>


	<jsp:useBean id="Car" class="common.Car" scope="request" />
	<jsp:setProperty property="carName" value="<%=name %>" name="Car" />
	<jsp:setProperty property="carColor" value="<%=color %>" name="Car" />
	<jsp:setProperty property="carPrice" value="<%=price %>" name="Car" />
	<ul>
		<li>자동차 이름 : <jsp:getProperty property="carName" name="Car" /></li>
		<li>자동차 가격 : <jsp:getProperty property="carPrice" name="Car" /></li>
		<li>자동차 색상 : <jsp:getProperty property="carColor" name="Car" /></li>
	</ul>
	
	<!-- useBean id랑 jsp:property의 name 이름이랑 같아야함
		 property는 자바의 멤버필드랑 이름이 같아야함  -->

</body>
</html>