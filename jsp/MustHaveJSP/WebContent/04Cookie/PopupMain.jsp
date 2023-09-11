<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String popupMode = "on";

Cookie[] cookies = request.getCookies();
if (cookies != null) {
	for (Cookie c : cookies) {
		String cookieName = c.getName();
		String cookieValue = c.getValue();
		if (cookieName.equals("PopupClose")) {
			popupMode = cookieValue;
		}
	}

}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PopupMain</title>
<link rel="stylesheet" href="css/cookie.css">
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script>
	$(function(){
		$("#closeBtn").click(function(){
		$("#popup").hide();
		var chkVal = $("input:checkbox[id=inactiveToday]:checked").val(); // 체크된(선택된) 체크박스의 값을 가져오고 chkVal 변수에 저장
										  // chkVal에 저장된 값은 체크박스의 상태에 따라 달라짐
										  // 체크박스가 체크되어 있다면 해당 값은 체크박스의 value 속성의 값, 체크되어 있지 않다면 null
		
		$.ajax({
			url : "PopupCookie.jsp",  // ajax 전송이 요청될 url
			type :"get",
			data : {inactiveToday : chkVal}, // inactiveToday의 데이터 지정 
			dataType :  "text",
			success : function(resData){				  //  AJAX 요청이 성공적으로 완료되면 실행될 함수를 정의,
				if(resData != '') location.reload();		  // 서버에서 받은 응답 데이터(resData)를 검사하여 페이지를 새로고침
						
			}
			})
		});
		
	});


</script>
</head>
<body>
	<%
		for (int i = 1; i <= 10; i++) {
		out.print("현재 팝업창은 " + popupMode + "상태입니다. <br>");
	}
	if (popupMode.equals("on")) {
	%>
	<div id="popup">
		<h2 align="center">공지사항 팝업입니다.</h2>
		<div align="right">
			<form name="popFrm">
				<input type="checkbox" id="inactiveToday" value="1"> 
				하루 동안 열지 않음 
				<input type="button" value="닫기" id="closeBtn">
			</form>
		</div>
	</div>
	<%
		}
	%>
</body>
</html>
