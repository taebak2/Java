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
	String id = request.getParameter("user_id");
	String pw = request.getParameter("user_pwd");

	/* web.xml을 이용해서 로그인 하는 방법 */
	if (application.getInitParameter("id") == "value" && application.getInitParameter("pw") == "1234") {
		response.sendRedirect("ResponseWelcome.jsp");
	} else {
		request.getRequestDispatcher("ResponseMain.jsp?loginError=1").forward(request, response);
	}

	/* if(id.equalsIgnoreCase("java") && pw.equalsIgnoreCase("1234")){
		response.sendRedirect("ResponseWelcome.jsp");
	} else {
		request.getRequestDispatcher("ResponseMain.jsp?loginErr=1").forward(request, response);
	} */

	/* request, response를 이용해 로그인 하는 방법 

	request.getRequestDispatcher("ResponseMain.jsp?loginErr=1"): 
	현재 요청을 다른 JSP 페이지인 "ResponseMain.jsp"로 전달하도록 준비 
	URL에 "loginErr=1"이라는 쿼리 매개변수를 포함

	request.getRequestDispatcher("ResponseMain.jsp"): 전달할 대상 JSP 페이지("ResponseMain.jsp")를 지정

	?loginErr=1: URL에 쿼리 매개변수를 추가, 이 경우 "loginErr"이라는 매개변수와 값 "1"이 포함 
			 	 대상 JSP 페이지에서 로그인 오류를 나타내는 데 사용

	.forward(request, response);: 전달 작업을 수행

	request: 현재의 HttpServletRequest 객체를 나타냄, 
		 	 이 객체에는 클라이언트 요청에 관한 정보가 포함
	response: HttpServletResponse 객체를 나타냄, 
	  		  이 객체는 클라이언트에 응답을 보내기 위해 사용됨 */
	%>

</body>
</html>