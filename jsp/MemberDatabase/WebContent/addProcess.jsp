<%@page import="java.sql.PreparedStatement"%>
<%@page import="common.MySqlConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>MySql 연결</h2>
	<%
		request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String pw = request.getParameter("pw");
	String pw_check = request.getParameter("pw_check");
	String num = request.getParameter("num");
	String email = request.getParameter("email");
	String email2 = request.getParameter("email2");
	String text = request.getParameter("question");
	String path[] = request.getParameterValues("checkbox");
	String pathStr = "";
	for (int i = 0; i < path.length; i++) {
		pathStr = path[i] + " ";
	}
	;

	if (pw.equals(pw_check)) {
		MySqlConnect mc = new MySqlConnect();
		String sql = "insert into signUp values (?,?,?,?,?,?,?,?)";
		PreparedStatement psmt = mc.con.prepareStatement(sql);
		psmt.setString(1, id);
		psmt.setString(2, name);
		psmt.setString(3, pw);
		psmt.setString(4, pw_check);
		psmt.setString(5, num);
		psmt.setString(6, email+email2);
		psmt.setString(7, text);
		psmt.setString(8, pathStr);
		int result = psmt.executeUpdate();
		if (result == 1) {
			out.print("정상 처리 되었습니다.");
			mc.close();
		}
	} else {
		response.sendRedirect("addMember.jsp");
	}
	%>
</body>
</html>