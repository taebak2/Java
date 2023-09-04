<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="dto.Book"%>
<%@ page import="dto.BookRepository"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>books</title>
</head>
<body>
	<%
		BookRepository dao = new BookRepository();
		ArrayList<Book> list = dao.getAllBooks();
		for(Book book : dao.getAllBooks()){
	%>
	<div class="col-md-4">
	<h3><%=book.getBookName()%></h3>
	<h3><%=book.getBookPrice()%></h3>
	<h3><%=book.getAuthor()%></h3>
	</div>
	<%} %>
</body>
</html>