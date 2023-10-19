<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write</title>
</head>
<body>
	<jsp:include page="../Common/Link.jsp"/>
	
	<h2> 회원제 게시판 - 글쓰기 </h2>
	<form name="writeFrm" method="post" action="../mvcboard/write.do" enctype="multipart/form-data">	
	<!-- action태그에서 .do를 하면 xml mapping에서 write를 찾음 -->
		<table border="1" width="90%">
			<tr>
				<td>작성자</td>
				<td>
					<input type="text" name="name" style="width:150px;" required>
				</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>
					<input type="text" name="title" style="width:90%;" required>
				</td>
			</tr>
			<tr>
			<td>내용</td>
				<td>
					<textarea name="content" style="width:90%; height: 100px;" required></textarea>
				</td>
			</tr>
			<tr>
			<td>첨부 파일</td>
				<td>
					<input type="file" name="ofile">
				</td>
			</tr>
			<tr>
			<td>비밀번호</td>
				<td>
					<input type="password" name="pass" style="width: 100px;" required>
				</td>
			</tr>
			<tr>
			<td colspan="2" align="center">
			<button type="submit">작성 완료</button>
			<button type="reset">다시 입력</button>
			<button type="button" onclick="location.href='../mvcboard/list.do';">목록 보기</button>
			</td>
			</tr>
		</table>
	
	</form>
</body>
</html>
