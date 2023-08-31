<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>3. 요청 헤더 정보 출력하기 </h2>
	<%
		Enumeration headers = request.getHeaderNames();
		while(headers.hasMoreElements()){ 						// headers 열거형에 아직 처리되지 않은 요소가 있는 동안에만 반복
			String headerName = (String)headers.nextElement();  // nextElement() 메서드는 열거형에서 다음 요소를 가져오는 역할
			String headerValue = request.getHeader(headerName); // 헤더 이름(headerName)에 해당하는 요청 헤더의 값을 얻어옴
			out.print("헤더명 : " + headerName + ", 헤더값 : " + headerValue + "<br/>");
		}	
	%>
</body>
</html>