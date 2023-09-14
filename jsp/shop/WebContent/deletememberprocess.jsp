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
	String id = (String)session.getAttribute("user_id");
	String pw = request.getParameter("pw");
	
	MemberDAO dao = new MemberDAO();
	String result = dao.deleteMember(id,pw);
	
	if(result.equals("")){
		request.getRequestDispatcher("deletemember.jsp?error=1").forward(request, response);
	} else {
		dao.close();
		response.sendRedirect("logout.jsp");
	}
%>


</body>
</html>