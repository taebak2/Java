<%@page import="dto.Product"%>
<%@page import="dao.ProductRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="processAddProduct.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>processAddProcess</title>
</head>
<body>
	<%
	ProductRepository dao = new ProductRepository();
	Product product = new Product();
	product.setProductId(productId);
	product.setPname(pname);
	product.setUnitPrice(unitPrice);
	product.setDescription(description);
	product.setManufacturer(manufacturer);
	product.setCategory(category);
	product.setUnitsInStock(unitsInStock);
	product.setCondition(condition);
	int result = dao.addProduct(product);

	if (result == 1) {
		response.sendRedirect("products.jsp");
	} else {
		request.getRequestDispatcher("addProduct.jsp?Error=1").forward(request, response);
	}
	%>
</body>
</html>
