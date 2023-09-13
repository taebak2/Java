<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.removeAttribute("UserId");	// 세션에서 특정 이름의 데이터(attribute)만을 제거
	session.removeAttribute("UserName");
	
	session.invalidate();	// 현재 사용 중인 세션의 모든 데이터가 삭제되고 
							// 세션 자체가 종료
							// 사용자의 로그인 상태나 
							// 세션에 저장된 모든 정보가 제거
	response.sendRedirect("LoginForm.jsp");
%>