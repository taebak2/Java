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
		String result = request.getParameter("result");
	if (result != null) {
		out.print("<h1>비밀번호가 틀렸어요</h1>");
	}
	%>
	<form action="examProcess.jsp" method="post">
		<p>
			이름 : <input type="text" name="id">
			비밀번호 : <input type="password" name="pw">
			<input type="submit" value="전송">
		</p>
	</form>
</body>
</html>