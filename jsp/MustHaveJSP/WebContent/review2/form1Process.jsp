<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form1process</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8"); // 성별, 취미는 한글이라서 encoding을 해줘야함
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String[] hobby = request.getParameterValues("hobby");
	// 향상된 for문
		
	
	String hobby2 = "";
	for(String h : hobby){ // 향상된 for문 
	hobby2 += h + " ";}
	
	String hobby3 = "";
	for(int i=0; i<hobby.length; i++){ 
		hobby3 += hobby[i] + " ";
		}
		%>
	<h2>아이디 :<%=id %> </h2>
	<h2>패스워드 :<%=pw %> </h2>
	<h2>이름 : <%=name %></h2>
	<h2>성별 : <%=gender %></h2>
	<h2>취미 : <%=hobby2 %></h2>
	 
</body>
</html>