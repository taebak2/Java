<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<%
		String chkVal = request.getParameter("inactiveToday");
	
		if(chkVal != null && chkVal.equals("1")){
			Cookie cookie = new Cookie("PopupClose","off");
			cookie.setPath(request.getContextPath());
			cookie.setMaxAge(20);
			response.addCookie(cookie);
			out.print("쿠키 : 하루 동안 열지 않음");
		}
	%>
