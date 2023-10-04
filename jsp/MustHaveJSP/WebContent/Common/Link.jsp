<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="90%">
	<tr>
	<td align="center">
		<% if (session.getAttribute("UserId")==null) { %>
			<a href="../06Session/LoginForm.jsp">로그인</a>
		<%} else { %>
			<a href="../06Session/Logout.jsp">로그아웃</a>
		<% } %>
		&nbsp;&nbsp;&nbsp; <!-- %nbsp;는 html의 공백 메서드, 줄바꿈을 일으키지 않으면서 공백을 넣고 싶을 때 &nbsp;를 사용 -->
		<a href="../08Board/List.jsp">게시판(페이징X)</a>
		&nbsp;&nbsp;&nbsp;
		<a href="../09PagingBoard/List.jsp">게시판(페이징O)</a>
	</td>
	</tr>
	</table>
</body>
</html>