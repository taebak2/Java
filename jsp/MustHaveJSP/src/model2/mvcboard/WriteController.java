package model2.mvcboard;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

import fileupload.FileUtil; 
import utils.JSFunction;


public class WriteController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
		request.getRequestDispatcher("/14MVCBoard/Write.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String saveDirectory = request.getServletContext().getRealPath("/Uploads");
		
		// getServletContext() HttpServlet 클래스의 메서드
		// Java 언어와 jsp 언어는 다르기 때문에 getServletContext() 메서드를 사용해야함 
		
		ServletContext application = request.getServletContext();
		int maxPostSize = Integer.parseInt(application.getInitParameter("maxPostSize"));
		
		MultipartRequest mr = FileUtil.uploadFile(request, saveDirectory, maxPostSize);
		
		if(mr==null) {
			JSFunction.alertLocation(response,"첨부 파일 용량 초과", "../mvcboard/write.do");
			return;
		}
		
		MVCBoardDTO dto = new MVCBoardDTO();
		dto.setName(mr.getParameter("name"));
		dto.setTitle(mr.getParameter("title"));
		dto.setContent(mr.getParameter("content"));
		dto.setPass(mr.getParameter("pass"));
		
		String fileName = mr.getFilesystemName("ofile");
		if(fileName != null) {
			String now = new SimpleDateFormat("yyyyMMdd_HmsS").format(new Date());	 
			String ext = fileName.substring(fileName.lastIndexOf("."));
			String newFileName = now + ext;
			
			File oldFile = new File(saveDirectory+File.separator + fileName);	
			File newFile = new File(saveDirectory+File.separator + newFileName);
			oldFile.renameTo(newFile);

			dto.setOfile(fileName);		// 원래 파일 이름
			dto.setSfile(newFileName);	// 서버에 저장된 파일 이름
			
			// DAO를 통해 DB에 게시 내용 저장 
			MVCBoardDAO dao = new MVCBoardDAO();
			int result = dao.insertWrite(dto);
			dao.close();
			
			if(result ==1 ) {	// 글쓰기 성공
				response.sendRedirect("../mvcboard/list.do");
			}
			else {	// 글쓰기 실패
				response.sendRedirect("../mvcboard/write.do");
			}
		}
	}
}
