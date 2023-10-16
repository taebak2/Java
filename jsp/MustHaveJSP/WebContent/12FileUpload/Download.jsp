<%@page import="utils.JSFunction"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.io.*" %>

<%
		String saveDirectory = application.getRealPath("/Uploads"); 
		String saveFilename = request.getParameter("sName");
		String originalFilename = request.getParameter("oName");
		
		try{
			File file = new File(saveDirectory,saveFilename);	// saveDirectory : 파일을 저장하려는 디렉터리의 경로
			InputStream inStream = new FileInputStream(file);	// saveFilename : 새로운 파일의 이름
			
			String client = request.getHeader("User-agent");
			// request.getHeader("User-agent")를 사용하여 HTTP 요청의 User-Agent 헤더 값 가져옴
			// User-Agent 헤더는 클라이언트 브라우저 및 운영 체제 정보를 포함하고 있어, 클라이언트를 식별하는 데 사용
			
			if(client.indexOf("WOW64")==1){	
			// User-Agent 문자열에 "WOW64"라는 문자열이 포함되어 있는지를 검사
			// "WOW64"는 Windows 64비트 운영 체제에서 32비트 응용 프로그램을 나타내는 문자열
			// 클라이언트가 64비트 Windows를 사용하는지 확인
				originalFilename = new String(originalFilename.getBytes("utf-8"),"ISO-8859-1");
			} else {
				originalFilename = new String(originalFilename.getBytes("KSC5601"),"ISO-8859-1");
			}
			
			/* 일부 브라우저가 파일 이름을 ISO-8859-1 인코딩으로 요구하기 때문에
			originalFilename 문자열을 UTF-8에서 ISO-8859-1 문자 인코딩으로 변환
			그렇지 않은 경우, 즉 32비트 Windows나 다른 운영 체제를 사용하는 경우, 
			originalFilename 문자열을 KSC5601에서 ISO-8859-1 문자 인코딩으로 변환
			KSC5601은 한국어 문자 인코딩 */
			
			response.reset();	
			// HTTP 응답을 재설정, 이전에 설정된 응답 헤더나 내용을 초기화하고 새로운 설정을 시작할 수 있음

			response.setContentType("application/octet-stream");	
			// HTTP 응답의 콘텐츠 타입을 설정, 8비트 스트림 설정

			response.setHeader("Content-Disposition", "attachment; filename=\"" + originalFilename + "\"");	
			// 웹 애플리케이션에서 파일 다운로드를 처리하기 위해 사용되는 중요한 설정
			// HTTP 응답 헤더에 "Content-Disposition" 헤더를 설정

			response.setHeader("Content-Length","" +file.length());
			// 웹 애플리케이션에서 파일 다운로드를 처리할 때, 다운로드할 파일의 크기를 클라이언트 브라우저에 알려줌
			
			out.clear();	
			// JSP 페이지에서 출력 스트림(out)을 지우는 역할

			OutputStream outStream = response.getOutputStream();
			// response 객체에서 출력 스트림을 얻어 outStream 변수에 저장
			// 이 스트림을 사용하여 파일의 내용을 클라이언트 브라우저로 전송

			byte b[] = new byte[(int)file.length()];
			// 파일의 크기에 해당하는 바이트 배열 b를 생성
			// 이 배열은 파일 데이터를 읽고 클라이언트로 전송하기 위해 사용

			int readBuffer = 0;
			// 파일 데이터를 읽을 때 사용할 변수 readBuffer를 초기화

			while((readBuffer = inStream.read(b)) > 0) {
				outStream.write(b,0,readBuffer);
			}
			//	파일을 읽고 클라이언트에게 전송하는 루프를 설정
			//	inStream은 파일을 읽는 입력 스트림
			//	b 배열에 데이터를 읽어옴
			//	읽은 데이터의 길이를 readBuffer에 저장하고, 
			//	이 값이 0보다 크면 파일 내용을 출력 스트림인 outStream을 통해 클라이언트로 전송
			
			inStream.close();
			outStream.close();
			// 입력 스트림과 출력 스트림을 닫아 리소스를 해제
			// 웹 애플리케이션에서 파일 다운로드를 처리하기 위한 일반적인 코드 조각
			
			
		}	catch(Exception e) {
			e.printStackTrace();
			JSFunction.alertBack("예외가 발생했습니다",out);
		}
%>

