<%@page import="model1.board.BoardDAO"%>
<%@page import="model1.board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="IsLoggedIn.jsp"%>
<!-- 로그인 확인을 위한 인클루드.. 
만약 글쓰기 페이지에서 세션 유지 시간이 지날 동안 동작이 없었다면 
로그인이 해제될 수 있기 때문 -->



<!-- 순서 : 전송된 폼값을 DTO 객체에 담아 insertWrite() 메서드를 호출해 DB에 저장 -->
<%
	String title = request.getParameter("title");	
	String content = request.getParameter("content");
	// 1.폼값 받기
	
	BoardDTO dto = new BoardDTO();
	dto.setTitle(title);
	dto.setContent(content);
	dto.setId(session.getAttribute("UserId").toString());	// board 테이블의 id칼럼은 member 테이블의 id컬럼과 Foreign key로 설정됐기 때문에 
															// 만약 id가 null값이면 INSERT시에 제약조건 위배로 오류가 발생하기 때문에 
															// session 영역의 id 역시 DTO에 담음
	// 2.폼값을 DTO 객체에 저장
	
	BoardDAO dao = new BoardDAO(application);	// DAO를 application으로 생성한 이유??
	int iResult = dao.insertWrite(dto);	
	dao.close();
	// 3. DAO 객체를 통해 DB에 DTO 저장	
	if(iResult==1){
		response.sendRedirect("List.jsp");	// 성공 -> 목록 페이지로 이동 
		
	}else {
		JSFunction.alertBack("글쓰기 실패했어요",out);	// 실패 -> 경고창을 띄운 후, 이전 페이지로 이동
	}
%>
