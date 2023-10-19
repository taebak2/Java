package fileupload;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

public class FileUtil {
	// 파일 업로드(multipart/form-data 요청) 처리
	public static MultipartRequest uploadFile(HttpServletRequest req, String saveDirectory, int maxPostSize) {
		try {
			// 파일 업로드
			System.out.println("FileUtil.java 파일 업로드 성공");
			return new MultipartRequest(req, saveDirectory, maxPostSize, "UTF-8");
		} catch (Exception e) {
			// 업로드 실패
			System.out.println("FileUtil.java 파일 업로드 실패");
			e.printStackTrace();
			return null;
		}

	}

	public static void download(HttpServletRequest request, HttpServletResponse response, String directory,
			 String sfileName, String ofileName) {
		String sDirectory = request.getServletContext().getRealPath(directory);
			
		try {
			File file = new File(sDirectory, sfileName);
			InputStream iStream = new FileInputStream(file);

			String client = request.getHeader("User-Agent");
			if(client.indexOf("WOW64")==1){	
				ofileName = new String(ofileName.getBytes("utf-8"),"ISO-8859-1");
				} else {
				ofileName = new String(ofileName.getBytes("KSC5601"),"ISO-8859-1");
				}
			
			response.reset();	// HTTP 응답을 재설정, 이전에 설정된 응답 헤더나 내용을 초기화하고 새로운 설정을 시작할 수 있음
			response.setContentType("application/octet-stream");	// HTTP 응답의 콘텐츠 타입을 설정, 8비트 스트림 설정
			response.setHeader("Content-Disposition", "attachment; filename=\"" + ofileName + "\"");	
			response.setHeader("Content-Length","" +file.length());
			
			OutputStream oStream = response.getOutputStream();
			
			byte b[] = new byte[(int)file.length()];
			int readBuffer = 0;
			while((readBuffer = iStream.read(b)) > 0) {
				oStream.write(b,0,readBuffer);
			}
			
			iStream.close();
			oStream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");

		}
	}
	
	public static void deleteFile(HttpServletRequest request, String directory, String filename) {
		
		String sDirectory = request.getServletContext().getRealPath(directory);	// 서블릿컨텍스트 쓰는 기준이 뭐임?
		File file = new File(sDirectory + File.separator + filename);
		if(file.exists()) {
			file.delete();
		}
	}
}
