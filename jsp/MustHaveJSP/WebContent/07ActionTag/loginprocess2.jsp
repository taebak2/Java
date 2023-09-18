<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginprocess2</title>
</head>
<body>
<ul>
 <li>아이디 : <%=request.getAttribute("id") %></li>
 <li>패스워드 : <%=pageContext.getAttribute("pw") %></li>
 </ul>
</body>
</html>
