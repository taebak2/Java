<%@page import="dto.MemberShipDTO"%>
<%@page import="dao.MemberShipDAO"%>
<%@page import="common.JSFunction"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="top.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	MemberShipDAO dao = new MemberShipDAO();	
	MemberShipDTO dto = dao.selectMember(id, pw);
	
	
	if(dto.getMemberid()!=null){
		session.setAttribute("member_id", dto.getMemberid());
		session.setAttribute("member_pw", dto.getMemberpw());
		JSFunction.alertLocation("로그인 성공", "login.jsp", out);
	}
	else{
		JSFunction.alertBack("로그인 실패", out);
	}
	%>
</body>
</html>