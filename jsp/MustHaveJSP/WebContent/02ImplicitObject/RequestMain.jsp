<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장 객체 - request</title>
</head>
<body>
	<h2>1. 클라이언트와 서버의 환경정보 읽기</h2>
	<a href="./RequestWebInfo.jsp?eng=Hello&han=안녕"> GET 방식 전송</a>
	<!-- href 속성에는 링크가 이동할 URL을 지정, 현재 디렉토리에서 "RequestWebInfo.jsp" 페이지로 이동하며 eng와 han 파라미터가 함께 전달 
		 eng=Hello&han=안녕: 이 부분은 URL의 쿼리 스트링(Query String) 부분, URL의 물음표(?) 뒤에 오는 데이터로, key=value 형식으로 구성
	 	 여기서 eng와 han은 파라미터의 이름, Hello와 안녕은 해당 파라미터의 값, 파라미터들은 & 기호로 구분 -->
	<br>
	<form action="RequestWebInfo.jsp" method="post">
		영어 : <input type="text" name="eng" value="Bye"><br> 한글 :
		<input type="text" name="han" value="잘가"><br> <input
			type="submit" value="포스트 방식 전송">
	</form>

	<h2> 2. 클라이언트의 요청 매개변수 읽기 </h2>
	<form method="post" action="RequestParameter.jsp">
		아이디 : <input type="text" name="id" value=""><br> 
		성별 : 
			<input type="radio" name="gender" value="man">남자 
			<input type="radio" name="gender" value="woman" checked="checked">여자<br>
		관심사항 : 
			<input type="checkbox" name="favo" value="eco">경제 
			<input type="checkbox" name="favo" value="pol" checked="checked">정치
			<input type="checkbox" name="favo" value="ent">연예 <br>
		자기소개 :
			<textarea name="intro" rows="4" cols="30"></textarea><br>
			<input type="submit" value="전송하기">
	</form>
	
	<h2>3. HTTP 요청 헤더 정보 읽기</h2>
	<a href="RequestHeader.jsp"> 요청 헤더 정보 읽기</a>
</body>
</html>