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
<title>addmemberprocess</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	String num = request.getParameter("num");
	String ads = request.getParameter("address");

	MemberDAO dao = new MemberDAO();

	String sql = "select * from member";
	PreparedStatement psmt = dao.con.prepareStatement(sql);
	ResultSet rs = psmt.executeQuery();	// ResultSet을 사용하는 이유는 select 문은 결과창이 나오기 때문에
										// ex) insert문은 결과창을 따로 보여주지 않기 때문에 update만 해도됨

	String result = "";
	while (rs.next()) {
		String id2 = rs.getString(1);

		if (id.equals(id2)) {
			result = "기존회원";
			request.getRequestDispatcher("addmember.jsp?error=1").forward(request, response);
			break;
		}
	}

	dao.addMember(id, name, password, num, ads);
	result = "환영합니다";
	dao.close();
	%>
	
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">회원 가입</h1>
		</div>
	</div>
	<div class="container">
	<h1 class="display-5"><%=result %></h1>
	</div>
	<%@ include file="footer.jsp" %>
</body>
</html>