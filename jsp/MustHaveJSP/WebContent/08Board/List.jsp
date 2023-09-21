<%@page import="model1.board.BoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="model1.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	BoardDAO dao = new BoardDAO(application); 			// DB 연결
	Map<String, Object> param = new HashMap<String, Object>(); 	// 검색 필드와 검색 단어를 저장하기 위한 맵(Map)을 생성
									// 이 맵은 검색 조건을 저장하는데 사용

String searchField = request.getParameter("searchField");
String searchWord = request.getParameter("searchWord");
// 사용자가 입력한 검색필드와 검색단어를 저장함

if (searchWord != null) {
	param.put("searchField", searchField);
	param.put("searchWord", searchWord);
}
// 만약 사용자가 검색 단어를 입력한 경우, param 맵에 검색 필드와 검색 단어를 저장

int totalCount = dao.selectCount(param); 	    // 전체 게시물 개수 저장
List<BoardDTO> boardLists = dao.selectList(param);  // 게시물 목록 받아서 저장
dao.close();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../Common/Link.jsp" />

	<h2>목록 보기</h2>
	<form method="get">
		<table border="1" width="90%">
			<tr>
				<td align="center">
				<select name="searchField">
						<option value="title">제목</option>
						<option value="content">내용</option>
				</select> 
				<input type="text" name="searchWord"> 
				<input type="submit" value="검색하기">
				</td>
			</tr>
		</table>
	</form>
	
	<table border="1" width="90%">
	<tr>
		<th width="10%">번호</th>
		<th width="50%">제목</th>
		<th width="15%">작성자</th>
		<th width="10%">조회수</th>
		<th width="15%">작성일</th>
	</tr>
	<% 
		if(boardLists.isEmpty()){
		// 게시물 목록이 비어있을 때 처리 구문
	%>
	<tr>
			<td colspan="5" align="center">
				게시글을 작성하세요
			</td>
	</tr>
	<% } else {
		int virtualNum = 0;			// 가상 번호 생성 (DB num (X), 화면 상에서의 번호를 나타냄
		for(BoardDTO dto : boardLists){
			virtualNum = totalCount --;	// 전체 게시물 수에서 시작해 1씩 감소
	%>
	<tr align="center">
		<td><%=virtualNum%></td>
		<td align="left">
			<a href="View.jsp?num=<%=dto.getNum()%>"><%=dto.getTitle() %></a>	<!--# : 현재 페이지 내에서 어떤 동작을 수행하도록 하는 역할  -->
			</td>
		<td align="center"><%=dto.getId() %></td>
		<td align="center"><%=dto.getVisitcount() %></td>
		<td align="center"><%=dto.getPostdate() %></td>
	</tr>
	<%
		} 
	}%>
	</table>
	<table border="1" width="90%">
		<tr align="right">
		<td>
			<button type="button" onclick="location.href='Write.jsp';">글쓰기</button>
		</td>
	</table>		
</body>
</html>
