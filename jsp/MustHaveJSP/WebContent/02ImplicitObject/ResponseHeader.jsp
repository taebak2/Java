<%@page import="java.util.Collection"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	SimpleDateFormat s = new SimpleDateFormat("yyyy-mm-dd HH:mm");
	long add_date = s.parse(request.getParameter("add_date")).getTime(); // parse 메서드를 사용하여 문자열을 Date 객체로 파싱, 
																		// getTime 메서드를 사용하여 Date 객체를 milliseconds로 표현된 long 값으로 변환
	int add_int = Integer.parseInt(request.getParameter("add_int"));
	// 8282(문자열) -> 숫자(int)
	String add_str = request.getParameter("add_str");
	// 홍길동

	response.addDateHeader("myBirthday", add_date);
	response.addIntHeader("myNumber", add_int); // 8282
	response.addIntHeader("myNumber", 1004); // 1004
	response.addHeader("myName", add_str); // 안중근
	response.setHeader("myName", "안중근"); // 안중근
	%>

	<h2>응답 헤더 정보 출력하기</h2>

	<%
		Collection<String> headerNames = response.getHeaderNames(); // name 중복시 1개만 가져옴
		for (String hName : headerNames) {
			String hValue = response.getHeader(hName); // response.getHeader : hName이 1개일 때 가져오는 메서드
	%>
			<li><%=hName%> : <%=hValue%></li>
	<%
		}
	%>
	<h2>myNumber만 출력하기</h2>
	<%
		Collection<String> myNumber = response.getHeaders("myNumber"); // response.getHeaders : 이름이 여러개일 때 가져오는 메서드
		for (String myNum : myNumber) { //  myNumber값을 String myNum에 대입 
										// for (a : b) : for는 b.length 값만큼, b값을 a에 대입
	%>
			<li>myNumber : <%=myNum%></li>
	<%
		}
	%>
</body>
</html>