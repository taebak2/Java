<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert01</title>
</head>
<body>
	<form action="insert02process.jsp" method="post">
		아이디 : <input type="text" name="id"><br>
		비밀번호 : <input type="password" name="pw"><br>
		이름 : <input type="text" name="name"><br>
		전화번호 : <input type="text" name="phone"><br>
		주소 : <input type="text" name="address"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>