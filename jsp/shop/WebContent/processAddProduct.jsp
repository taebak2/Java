<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>

<%
	request.setCharacterEncoding("utf-8");
	String productId = request.getParameter("productId");
	String pname = request.getParameter("pname");
	int unitPrice= Integer.parseInt(request.getParameter("unitPrice"));
	String description = request.getParameter("description");
	String manufacturer = request.getParameter("manufacturer");
	String category = request.getParameter("category");
	long unitsInStock = Long.parseLong(request.getParameter("unitsInStock"));
	String condition = request.getParameter("condition");

	
	Product newProduct = new Product();
	newProduct.setProductId(productId);
	newProduct.setPname(pname);
	newProduct.setUnitPrice(unitPrice);
	newProduct.setDescription(description);
	newProduct.setManufacturer(manufacturer);
	newProduct.setCategory(category);
	newProduct.setUnitsInStock(unitsInStock);
	newProduct.setCondition(condition);
	
	 // 싱글톤 패턴으로 생성한 인스턴스인 pr을 통해 addProduct 메서드를 호출, 새 제품을 저장
	response.sendRedirect("products.jsp"); //  "products.jsp" 페이지로 리다이렉트
	
%>