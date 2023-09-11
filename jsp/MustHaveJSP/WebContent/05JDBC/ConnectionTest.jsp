<%@page import="common.JDBConnect"%>
<%@page import="common.JDBConnect2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> JDBC 테스트</h2>
	<%
		JDBConnect jdbc1 = new JDBConnect();
		jdbc1.close();	
	%>
	
	<h2> JDBC 테스트2 </h2>
	<%
		String driver = application.getInitParameter("OracleDriver"); // web에서 끌어오는 메서드 
		String url = application.getInitParameter("OracleURL");
		String id = application.getInitParameter("OracleId");
		String pwd = application.getInitParameter("OraclePwd");
		JDBConnect jdbc2 = new JDBConnect(driver,url,id,pwd);
		jdbc2.close();
	%>
	<h2> JDBC 테스트3</h2>
	<%
		String driver2 = application.getInitParameter("MysqlDriver"); 
		String url2 = application.getInitParameter("MysqlURL");
		String id2 = application.getInitParameter("MysqlId");
		String pwd2 = application.getInitParameter("MysqlPwd");
		JDBConnect2 jdbc3 = new JDBConnect2(driver2,url2,id2,pwd2,out);
	%>
</body>
</html>
