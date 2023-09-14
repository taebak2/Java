<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
	String id = (String)session.getAttribute("user_id");
	String password = request.getParameter("password");
	String num = request.getParameter("num");
	String ads = request.getParameter("address");

	MemberDAO dao = new MemberDAO();

	dao.editmember(id, password, num, ads);
	String result = "회원 정보가 수정되었습니다.";
	dao.close();
	%>
	
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">회원 정보수정</h1>
		</div>
	</div>
	<div class="container">
	<h1 class="display-5"><%=result %></h1>
	</div>
	<%@ include file="footer.jsp" %>
</body>
</html>