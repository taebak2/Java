<%@page import="model1.board.BoardDAO"%>
<%@page import="model1.board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "IsLoggedIn.jsp" %>

<%
	String num = request.getParameter("num");		// 게시물 번호 
	String title = request.getParameter("title");		// 제목
	String content = request.getParameter("content");	// 내용
	
	BoardDTO dto = new BoardDTO();				// BoardDAO 클래스를 사용하여 게시물 번호에 해당하는 게시물 정보(BoardDTO)를 조회
	BoardDAO dao = new BoardDAO(application);
	dto = dao.selectView(num);
	
	String sessionId = session.getAttribute("UserId").toString(); // 현재 사용자의 세션에서 "UserId" 속성(로그인ID)을 가져와서 sessionId 변수에 저장
	int delResult = 0;
	if(sessionId.equals(dto.getId())) {
		dto.setNum(num);			// 삭제할 게시물 번호 설정
		delResult = dao.deletePost(dto);	// 게시물 삭제 및 결과값 받기 
		dao.close();				// 데이터베이스 연결 닫기
	}
	
	if(delResult == 1 ) {
		JSFunction.alertLocation("삭제되었습니다", "List.jsp", out);
	} else {
		JSFunction.alertBack("본인만 삭제할 수 있습니다", out);
		return;
	}
%>
