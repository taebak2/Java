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
		String none = request.getParameter("none");
		if (none != null) out.print("좋아하는 과일이 없군요");
	%>

	<h1>좋아하는 과일을 선택하세요!!!</h1>
	<form action="choiceResult.jsp" method="post">
		<select name="fruit">
			<option value="과일선택">과일선택</option>
			<option value="바나나">바나나</option>
			<option value="사과">사과</option>
			<option value="수박">수박</option>
			<option value="포도">포도</option>
			<option value="오렌지">오렌지</option>
			<option value="none">없음</option>
		</select> <input type="submit" value="보내기">
	</form>

</body>
</html>