<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="dto.Cloth"%>
<%@ page import="dto.ClothRepository"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		ClothRepository cr = new ClothRepository();
		Cloth cloth = cr.getClothById(id);
	%>
	<div class="container">
		<div class="row" align="center">
			<div class="col-md-5">
			<img src="../resources/images/<%=cloth.getClothId()%>.jpg" style="width:100%">
			</div>
			<div class="col-md-6">
				<h3><%=cloth.getClothName()%></h3></br>
				<p>상품 아이디 : <span class="badge badge-danger">
				<%=cloth.getClothId()%></span></p>
				<p>색상 : <%=cloth.getClothColor()%></p>
				<p>가격 : <%=cloth.getClothCost()%></p>
				<p>사이즈 : <%=cloth.getClothSize()%></p>
			</div>
		</div>
	</div>
	
</body>
</html>