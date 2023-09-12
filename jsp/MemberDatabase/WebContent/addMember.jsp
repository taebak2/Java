<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/signUp.css">
</head>
<body>
	<div id="all">
		<div id="a">
			<h2>회원 가입</h2>
		</div>
		<form action="addProcess.jsp" method="post">
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>비밀번호</td>

					<td><input type="password" name="pw"></td>
				</tr>
				<tr>
					<td>비밀번호 확인</td>
					<td><input type="password" name="pw_check"></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" name="num"></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="text" name="email">@ <select name="email2">
							<option value="@naver.com">naver.com</option>
							<option value="@daum.net">daum.net</option>
							<option value="@google.com">google.com</option>
					</select></td>
				</tr>
				<tr>
					<td>문자수신 여부</td>
					<td><input type="radio" name="question" value="예"> 예 <input
						type="radio" name="question" value="아니오"> 아니오</td>
				</tr>
				<tr>
					<td>가입 경로</td>
					<td><input type="checkbox" name="checkbox" value="친구 소개">친구 소개 
					<input type="checkbox" name="checkbox" value="인터넷 검색">인터넷 검색 
					<input type="checkbox" name="checkbox" value="블로그">블로그
					<input type="checkbox" name="checkbox" value="기타">기타</td>
				</tr>
				<tr>
					<td>가입하기</td>
					<td><input type="submit" name="submit" value="전송"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>