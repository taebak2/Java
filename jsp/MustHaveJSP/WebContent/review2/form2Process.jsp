<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form2Process</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>파라미터 이름</td>
			<td>파라미터 값</td>
		</tr>
		<%
			request.setCharacterEncoding("utf-8");
			
			Enumeration pNames = request.getParameterNames(); // 파라미터값이 String, int등 다양해서 열거형으로 저장
			while(pNames.hasMoreElements()){
				String pName = (String)pNames.nextElement();
				out.print("<tr><td>" + pName + "</td>");
				String[] value = request.getParameterValues(pName);
					String value2 = "";
					for(String h : value){
						value2 += h+ " ";
					}
					out.print("<td>" + value2  + "</td></tr>");
			}
		%>
	</table>
</body>
</html>
