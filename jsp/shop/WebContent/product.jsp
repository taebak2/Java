<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>상품 상세 정보</title>
</head>
<body>
	<%@ include file="menu.jsp"%>
	<%@ include file="LoginCheck.jsp"%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 상세 정보</h1>
		</div>
	</div>
	<%
		String id = request.getParameter("id");
		ProductRepository dao = new ProductRepository();
		dao.selectProduct();
		Product product = dao.getProductById(id);
		// dao 객체를 사용하여 상품 ID를 기반으로 특정 상품 정보를 검색
		// getProductById 메서드는 id 값을 사용하여 데이터베이스에서 상품 정보를 가져옴
		// 검색된 상품 정보는 product 변수에 저장
	%>
	<div class="container">
		<div class="row">
			<div class="col-md-5">
			<img src="resources/images/<%=product.getProductId()%>.png" style="width:100%">
			</div>
			<div class="col-md-6">
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%></p>
				
				<p>상품 코드 : <span class="badge badge-danger">
				<%=product.getProductId()%></span></p>
				<p>제조사 : <%=product.getManufacturer()%></p>
				<p>구분 : <%=product.getCategory()%></p>
				<p>재고 : <%=product.getUnitsInStock()%></p>
				<p>가격 : <%=product.getUnitPrice()%></p>
				
				<p>
				<a href="#" class="btn btn-info">상품 주문</a>
				<a href="products.jsp" class="btn btn-secondary">상품 목록</a>
				</p>
			</div>
		</div>
	</div>
	
	<%@ include file="footer.jsp"%>
</body>
</html>