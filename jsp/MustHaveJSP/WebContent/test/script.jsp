<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int count=3;	// 멤버 변수 선언 

	String makeLower(String data) {		// 메소드 선언(파라미터 1개, 리턴 O)
		return data.toLowerCase();		// 소문자로 변환
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>script</title>
</head>
<body>
	<%
		for( int i=1; i<=count; i++){
			out.print("자바 서버 페이지" + i+ "<br>");
		}
	%>
	<%=makeLower("HELLO") %>
</body>
</html>