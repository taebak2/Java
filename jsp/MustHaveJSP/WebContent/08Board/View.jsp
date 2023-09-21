<%@page import="model1.board.BoardDTO"%>
<%@page import="model1.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String num = request.getParameter("num");
	BoardDAO dao = new BoardDAO(application); 	// 오라클 DB연결
	dao.updateVisitCount(num); 			// 게시물 조회수 증가
	BoardDTO dto = dao.selectView(num); 	  	// 게시물 상세내역 가져오기
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function deletePost() {
		var confirmed = confirm("정말로 삭제하시겠습니까");	
									// confirm 함수는 사용자에게 확인 또는 취소 옵션이 있는 경고 대화 상자를 표시
		if(confirmed){						// 사용자가 "확인"을 선택하면 confirmed 변수에 true, "취소"를 선택하면 false
									// 사용자가 "확인"을 선택한 경우에만 게시물 삭제를 수행
			var form = document.writeFrm;			// HTML 문서 내에 writeFrm이라는 이름의 폼 엘리먼트를 가정하고, 이를 form 변수에 할당
			form.method="post";
			form.action="DeleteProcess.jsp";
			form.submit();					// 사용자가 "확인"을 선택한 경우, JavaScript가 폼 데이터를 "DeleteProcess.jsp"로 전송하는 것을 의미 
		}
	}
</script>
</head>
<body>
	<jsp:include page="../Common/Link.jsp" />
	<h2>회원제 게시판 - 상세 보기</h2>
	<form name="writeFrm">
		<input type="hidden" name ="num" value ="<%=num%>">
		<table border="1" width=90%>
			<tr>
				<td>번호</td>
				<td><%=dto.getNum()%></td>
				<td>작성자</td>
				<td><%=dto.getName()%></td>
			</tr>
			<tr>
				<td>작성일</td>
				<td><%=dto.getPostdate()%></td>
				<td>조회수</td>
				<td><%=dto.getVisitcount()%></td>
			</tr>
			<tr>
				<td>제목</td>
				<td colspan="3" height="100"><%=dto.getTitle() %></td>
			</tr>
			<tr>
				<td>내용</td>
				<td colspan="3" height="100">
				<%=dto.getContent().replace("\r\n","<br>")%>
				</td>
			</tr>
			<tr>
				<td colspan="4" align="center">
				<%
					if(session.getAttribute("UserId") != null && session.getAttribute("UserId").toString().equals(dto.getId())){
				%>
				<button type="button" onclick="location.href='Edit.jsp?num=<%=dto.getNum()%>';">수정하기</button>
				<button type="button" onclick="deletePost();">삭제하기</button>
				<% } %>
				<button type="button" onclick="location.href='List.jsp'">목록 보기</button>
			</tr>
		</table>
	</form>
</body>
</html>
