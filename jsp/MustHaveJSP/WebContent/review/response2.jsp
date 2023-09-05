<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>가을 최고 여행지는 ?</h1>
	<form action="responseProcess.jsp" method="get">
		<select name="travel">
			<option value="프랑스">프랑스</option>
			<option value="일본">일본</option>
			<option value="뉴질랜드">뉴질랜드</option>
			<option value="스위스">스위스</option>
		</select> 
		<br>
		 <input type="submit" value="전송">
	</form>
</body>
</html>