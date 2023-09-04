<%@ page language="java" contentType="text/html; charset=UTF-8"

	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8"); // 문자 인코딩을 UTF-8로 설정 
										   // 폼 데이터의 한글 문자열이 제대로 처리
	String fruit = request.getParameter("fruit");
	if(fruit.equals("none")){
		request.getRequestDispatcher("choice.jsp?none=1") // : 만약 선택한 과일이 "none"인 경우, "choice.jsp"로 요청을 전달
		.forward(request, response); 					  // "none=1" 파라미터를 추가하여 이후 페이지에서 "좋아하는 과일이 없군요" 메시지를 표시
	}
	%>
	<h1>당신이 좋아하는 과일은 <%=fruit%> 입니다.</h1>
</body>
</html>