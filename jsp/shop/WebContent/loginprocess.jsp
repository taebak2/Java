<%@page import="dto.MemberDTO"%>
<%@page import="dto.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userId = request.getParameter("user_id");	// LoginForm.jsp에 있는
	String userPwd = request.getParameter("user_pw");	//  아이디 비밀번호 가져옴
	
	
	MemberDAO dao = new MemberDAO();	// DB 접속
	MemberDTO memberDTO = dao.getMemberDTO(userId, userPwd);
	dao.close();
	
	if(memberDTO.getId()!=null){	// memberDTO 객체에서 사용자 ID가 null이 아닌지 확인
		session.setAttribute("UserId", memberDTO.getId());
		session.setAttribute("UserName", memberDTO.getName());
		response.sendRedirect("Welcome.jsp");
	} else{
		request.setAttribute("LoginErrMsg", "아이디나 비번이 일치하지 않습니다.");
		request.getRequestDispatcher("login.jsp").forward(request,response);
	}
%>