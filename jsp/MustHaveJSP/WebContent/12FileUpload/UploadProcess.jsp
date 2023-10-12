<%@page import="fileupload.MyfileDTO"%>
<%@page import="fileupload.MyfileDAO"%>
<%@page import="java.io.File"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
		String saveDirectory = application.getRealPath("/Uploads"); 
		//	웹 애플리케이션에서 파일 또는 디렉터리의 실제 파일 시스템 경로를 반환
		int maxPostSize = 1024 * 1000;
		//	파일 최대 용량 1MB
		String encoding = "utf-8";

		try {
			MultipartRequest mr = new MultipartRequest(request, saveDirectory, maxPostSize, encoding); 
			// Java 웹 애플리케이션에서 파일 업로드를 처리하기 위한 클래스

			String name = mr.getParameter("name");	
			String title = mr.getParameter("title");
			String[] cateArray = mr.getParameterValues("cate");

			StringBuffer cateBuf = new StringBuffer();	
			// StringBuffer :  문자열 연산시에 사용하는 클래스
			
			if (cateArray == null) {
				cateBuf.append("선택 없음");
			// 	append 메서드는 여러 유형의 매개변수를 받을 수 있으며, 
			//	해당 데이터를 문자열로 변환하여 버퍼에 추가	
			
			} else {
				for (String s : cateArray) {
					cateBuf.append(s + ", ");
				}
			}
		
			String fileName = mr.getFilesystemName("attachedFile");		
			String ext = fileName.substring(fileName.lastIndexOf("."));
			//	mr.getFilesystemName(); : FileUploadMain의 첨부파일 가져오기														
			//  fileName.substring(); : 파일 이름에서 확장자(extension)를 추출하는 방법																	
			//	예를 들어, fileName이 "example.jpg"인 경우, 위 코드를 실행하면 
			//	ext 변수에 ".jpg"라는 문자열이 저장
		
		
			String now = new SimpleDateFormat("yyyyMMdd_HmsS").format(new Date());	 
			//	현재 날짜 시간 저장
			
			String newFileName = now + ext;
			//	신규 파일명 생성 
			//	ex) 장동건.jpg -> 20231012_12205.jpg
		
			File oldFile = new File(saveDirectory+File.separator + fileName);	
			//	File 클래스를 사용하여 지정된 디렉토리(saveDirectory)와 파일 이름(fileName)을 조합하여 
			//	파일 객체(oldFile)를 생성
			
			File newFile = new File(saveDirectory+File.separator + newFileName);
			oldFile.renameTo(newFile);
			// oldFile의 이름을 newFile의 이름으로 변경
			
			MyfileDTO dto = new MyfileDTO();
			dto.setName(name);
			dto.setTitle(title);
			dto.setCate(cateBuf.toString());
			dto.setOfile(fileName);
			dto.setSfile(newFileName);
			
			MyfileDAO dao = new MyfileDAO();
			dao.insertFile(dto);
			dao.close();
			
			response.sendRedirect("FileList.jsp");
			
			} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMessage", "파일 업로드 오류");
			request.getRequestDispatcher("FileUploadMain.jsp").forward(request, response);
			}
%>
<html>
<head>
<meta charset="UTF-8">
<title>UploadProcess</title>
</head>
<body>
	<%=saveDirectory%>

</body>
</html>