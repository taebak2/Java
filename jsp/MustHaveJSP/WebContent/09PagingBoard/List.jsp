<%@page import="model1.board.BoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import= "utils.BoardPage" %>
<%@page import="model1.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	BoardDAO dao = new BoardDAO(application); 				   // DB 연결
	Map<String, Object> param = new HashMap<String, Object>(); // 검색 필드와 검색 단어를 저장하기 위한 맵(Map)을 생성
															   // 이 맵은 검색 조건을 저장하는데 사용

// 사용자가 입력한 검색필드와 검색단어를 저장함
String searchField = request.getParameter("searchField");
String searchWord = request.getParameter("searchWord");

if (searchWord != null) {
	param.put("searchField", searchField);
	param.put("searchWord", searchWord);
}
// 만약 사용자가 검색 단어를 입력한 경우, param 맵에 검색 필드와 검색 단어를 저장

int totalCount = dao.selectCount(param); 			
// 전체 게시물 개수 저장
int pageSize = Integer.parseInt(application.getInitParameter("POSTS_PER_PAGE"));
//	web.xml에서 설정한 한 페이지 당 출력 게시물 저장 (10개)
int blockPage = Integer.parseInt(application.getInitParameter("PAGES_PER_BLOCK"));
//	web.xml에서 설정한 페이지 번호 출력수 저장 (5개)
int totalPage = (int)Math.ceil((double)totalCount/pageSize);
//	전체 페이지 개수 저장 

int pageNum = 1;	// 페이지 번호 초기값 설정
String pageTemp = request.getParameter("pageNum");
//	String pageTemp => int pageNum으로 바꾸는 이유는 
//	Parameter값을 가져오는 것이 String밖에 안되기 때문
//	사용자가 클릭한 페이지 번호를 가져와 pageNum에 저장함
if(pageTemp!=null && !pageTemp.equals(""))
	pageNum = Integer.parseInt(pageTemp);

//	각 페이지의 시작 번호와 끝 번호를 설정
int start = (pageNum-1) * pageSize + 1;	// 1, 6, 11 ....
int end = pageNum * pageSize;			// 10, 20, 30, 40 ....
param.put("start", start);
param.put("end", end);



List<BoardDTO> boardLists = dao.selectList(param);  
// 게시물 목록 받아서 저장
dao.close();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
 <style>
 	a{
 		text-decoration: none;
 	}
 </style>
</head>
<body>
	<jsp:include page="../Common/Link.jsp" />

	<h2> 목록 보기 - 현재 페이지 : <%=pageNum%> (전체 : <%=totalPage%>) </h2>
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
				글 없다~~ 게시글 작성해라!!
			</td>
	</tr>
	<% } else {
		int virtualNum = 0;				// 가상 번호 생성 (DB num (X), 화면 상에서의 번호를 나타냄
		int countNum = 0;
		for(BoardDTO dto : boardLists){
			// virtualNum = totalCount --;	// 전체 게시물 수에서 시작해 1씩 감소
			virtualNum = totalCount - (((pageNum - 1) * pageSize) + countNum++);
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
		<tr align="center">
		<td>
		<%=BoardPage.pagingStr(totalCount, pageSize, blockPage, pageNum, request.getRequestURI()) %>
		</td>
		<td>
			<button type="button" onclick="location.href='Write.jsp';">글쓰기</button>
		</td>
	</table>		
</body>
</html>