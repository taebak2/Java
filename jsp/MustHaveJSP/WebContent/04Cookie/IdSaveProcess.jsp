<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="utils.*" %>
<!DOCTYPE html>

<body>
	<%
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		String save_check = request.getParameter("save_check");
		
		
		
		if(user_id.equalsIgnoreCase("java") && user_pw.equalsIgnoreCase("1234")){
			if(save_check != null && save_check.equals("Y")){
				CookieManager.makeCookie(response, "loginId", user_id, 86400); // loginId : 생성할 쿠키 이름, user_id : 쿠키에 저장할 값, 86400 : 쿠키의 유효기간
			}else{
				CookieManager.deleteCookie(response, "loginId");
			}
			JSFuncton.alertLocation("로그인에 성공했습니다", "IdSaveMain.jsp", out); // 알림창에 "로그인에 성공했습니다" 표시, 이후 IdSaveMain.jsp로 이동 
		}else{
			JSFuncton.alertBack("로그인 실패입니다.", out);
		}
	%>
