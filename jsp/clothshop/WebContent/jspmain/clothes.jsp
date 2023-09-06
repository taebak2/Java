<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="dto.Cloth"%>
<%@ page import="dto.ClothRepository"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div></div>
	<%
		ClothRepository cloth = new ClothRepository();
		ArrayList<Cloth> list = cloth.getAllClothes();
		for (Cloth clothList : cloth.getAllClothes()) {
	%><div class="container">
		<div class="row" align="center">
			<div class="col-md-4">
				<img src="../resources/images/<%=clothList.getClothId()%>.jpg"
					style="width: 100%">">
			</div>
			<div class="col-md-5">
				<br>
				<h1><%=clothList.getClothId()%></h1>
				<br>
				<p>
					<a href="cloth.jsp?id=<%=clothList.getClothId()%>"
						class="btn btn-secondary" role="button">상세 정보</a>
				</p>
			</div>
		</div>
	</div>

	<%
		}
	%>
</body>
</html>