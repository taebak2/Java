<%@page import="common.OracleConnect"%>
<%@page import="java.sql.PreparedStatement"%>
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
		request.setCharacterEncoding("utf-8");
			String name = request.getParameter("name");
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			OracleConnect oc = new OracleConnect();	
			// 오라클 DB에 연결
			String sql = "insert into student values (?,?,?)";	
			// String name, id, pw 파라미터를 ?로 표시 (동적 쿼리이기 때문에) 
			// DB순서랑 sql value값 순서랑 같아야함
			PreparedStatement psmt = oc.con.prepareStatement(sql);
			// 문자열로 동적 쿼리문을 생성 
			psmt.setString(1, name);
			psmt.setString(2, id);
			psmt.setString(3, pw);
			int result = psmt.executeUpdate();	// 쿼리를 실행
			if(result==1){	
			out.print("정상 처리 되었습니다.");
			} else {
		out.print("회원 추가에 문제가 발생했습니다.");
			}
			oc.close();	// DB 연결 해제
	%>
</body>
</html>