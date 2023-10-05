<%@page import="common.JSFunction"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="dto.BoardDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WriteProcess</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	String title = request.getParameter("title");	// write.jsp에서 가져옴
	String content = request.getParameter("content");

	SimpleDateFormat curdateformat = new SimpleDateFormat("yyyy-MM-dd");
	String postdate = curdateformat.format(new Date());

	BoardDTO dto = new BoardDTO();
	// dto.setTitle(title);
	dto.setContent(content);
	dto.setId((String) session.getAttribute("user_id"));	// loginProcess.jsp에서 가져옴
	dto.setPostdate(postdate);

	BoardDAO dao = new BoardDAO();
	// int result = dao.insertWrite(dto);	// dto에서 setting한 값들을 insertWrite 메서드에 집어넣음
	
	int result = 0;
	for(int i=1; i<=1000; i++){
		dto.setTitle(title+"-"+i);
		result = dao.insertWrite(dto);
	}
	
	dao.close();
	

	if (result == 1) {
		response.sendRedirect("boardmain.jsp");
	} else {
		JSFunction.alertBack("글쓰기에 실패했습니다.", out);
	}
	%>
</body>
</html>