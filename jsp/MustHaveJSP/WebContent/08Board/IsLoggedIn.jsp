<%@page import="utils.JSFunction"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(session.getAttribute("UserId")==null){
		JSFunction.alertLocation("로그인 후 이용하세요", "../06SessionLoginForm.jsp", out);
		return;	
		
		/*  코드 실행을 중지하고 LoginForm 페이지로 넘어가면 
			현재 메서드나 함수를 더 이상 실행할 필요가 없기 때문에
			현재 페이지에서 더 이상의 작업을 수행하지 않도록 return을 사용 */
			
		
	}
%>