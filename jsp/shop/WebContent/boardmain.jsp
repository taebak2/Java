<%@page import="java.util.List"%>
<%@page import="dto.BoardDTO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="menu.jsp"%>
	<%@ include file="LoginCheck.jsp"%>
	<%
	BoardDAO dao = new BoardDAO();
	List<BoardDTO> boardLists = dao.selectList();
	%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">게시판</h1>
			<!-- "display-3" 클래스는 큰 제목에 적용되는 스타일 -->
		</div>
	</div>
	<div class="container">
		<table border="1" width="100%">
			<tr>
				<th width="10%">번호</th>
				<th width="50%">제목</th>
				<th width="15%">아이디</th>
				<th width="10%">조회수</th>
				<th width="15%">작성일</th>
			</tr>
			<%
				for(BoardDTO bto : boardLists) {
				
			%>
			<tr align="center">				
				<td><%=bto.getNum()%></td>
				<td><a href="View.jsp?num=<%=bto.getNum()%>"> <%=bto.getTitle()%></a></td>	
				<td><%=bto.getId()%></td>
				<td><%=bto.getVisitcount()%></td>
				<td><%=bto.getPostdate()%></td>
			<%} %>
		</table>
		<br>
		<button type="button" onclick="location.href='Write.jsp'">글쓰기</button>
	</div>
</body>
</html>