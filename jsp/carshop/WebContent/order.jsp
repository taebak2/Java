<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@page import="dto.Car"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.CarRepository"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
img{
float: left;
height: 200px;
}
div{
border:1px solid lightgray;
margin-bottom:10px;
width: 600px;
height: 200px;
}
</style>
</head>
<body>
	<p><a href="CarMain.jsp">홈</a></p>
	<%
		CarRepository car = new CarRepository();
		ArrayList<Car> list = car.allcar();
		for (Car CarList : car.allcar()) {
	%><div>
	<img src="./resources/images/<%=CarList.getCarName()%>.jpg">

				<h3>차 이름 : <%=CarList.getCarName()%></h3>
				<p>색상 : <%=CarList.getCarColor()%></p>
				<p>가격 : <%=CarList.getCarCost()%></p>
				<p>사이즈 : <%=CarList.getCarSize()%></p>
				<p>제조회사 : <%=CarList.getCarCompany()%></p>
			</div>
	<% 
		}
	%>
	

</body>
</html>