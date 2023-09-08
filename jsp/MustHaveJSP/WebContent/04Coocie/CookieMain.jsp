<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>1. 쿠키 설정</h2>
	<%
		// 쿠키는 웹 브라우저와 웹 서버 간에 데이터를 저장하고 공유하는 데 사용되는 작은 정보 조각

	Cookie cookie = new Cookie("myCookie", "애플쿠키맛있음");
	// 쿠키 이름은 쿠키를 식별하는 데 사용되며, 이 이름을 통해 서버 및 브라우저 간에 데이터를 교환
	// 위의 코드에서는 쿠키의 수명을 명시적으로 설정하지 않았으므로 브라우저 세션 동안 유지됨
	// 브라우저를 닫으면 쿠키가 삭제된다는 의미
	// 쿠키의 수명을 설정하려면 setMaxAge(int seconds) 메서드를 사용하여 쿠키가 유지될 시간(초 단위)을 설정
	// 쿠키를 클라이언트로 전송하려면 response.addCookie(cookie)와 같은 메서드를 사용
	// 웹 애플리케이션에서 사용자 정보를 추적하거나 상태 정보를 유지하는 데 자주 사용
	// 예를 들어, 로그인 세션을 관리하거나 사용자의 환경 설정을 저장하고 추적하는 데 사용

	cookie.setPath(request.getContextPath());
	// cookie.setPath("http://www.naver.com")
	// setPath() 메서드는 쿠키의 경로를 설정하는 데 사용
	// request.getContextPath()는 현재 웹 애플리케이션의 컨텍스트 경로를 반환
	// 예를 들어, 웹 애플리케이션이 "myapp"이라는 이름으로 배치되었다고 가정하면 
	// request.getContextPath()는 "/myapp" 문자열을 반환
	cookie.setMaxAge(60 * 60); // 1시간 유지 
	response.addCookie(cookie); // 응답 헤더에 쿠키 추가
	%>
	<h2>2. 쿠키 설정 후 값 확인하기</h2>
	<%
		Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie c : cookies) {
			String cookieName = c.getName();
			String cookieValue = c.getValue();
			out.print(cookieName + " : " + cookieValue);
		}
	}
	%>

<h2> 3. 페이지 이동 후 쿠키값 확인하기 </h2>
<a href="CookieResult.jsp"> 다음 페이지에서 확인하기 </a>
</body>
</html>