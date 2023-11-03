package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;

import model.member;
import model.memberDAO;

public class RegisterServlet extends HttpServlet {
	
	private memberDAO cymemberDAO;
	
	public void init() {
		cymemberDAO = new memberDAO();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String saveDirectory = req.getServletContext().getRealPath("./resources/img/");
		int maxPostSize = 1024 * 1000;
		String encoding = "utf-8";
		
		MultipartRequest mr = new MultipartRequest(req, saveDirectory, maxPostSize, encoding);
		
		
		String id = mr.getParameter("id");
		String pw = mr.getParameter("pw");
		String email = mr.getParameter("email") + "@" + mr.getParameterValues("com")[0];
		String phone = mr.getParameterValues("phone-1")[0] +
				"-" + mr.getParameter("phone-2") + "-" + mr.getParameter("phone-3");
		
		/*
		 * Enumeration<E> files = mr.getFileNames(); 		// multipart에서 가져올 수 있는 모든 이름들을 가져옴
		 * String imgName = (String) files.nextElement(); 	// String으로 변환 String fileName
		 * = mr.getFilesystemName(user_img);				// user_img라는 변수가 다중 파트 요청 내에서 특정 필드 이름을 보유, 
		 */ 												// 이 필드 이름은 아마도 HTML 폼의 파일 업로드 입력 필드에 해당
														 
		String isAdmin = mr.getParameter("grant");
		String imgName = mr.getFilesystemName("user_img");
		
		member cyMember = new member();
		cyMember.setId(id);
		cyMember.setPassword(pw);
		cyMember.setEmail(email);
		cyMember.setPhone(phone);
		cyMember.setIsAdmin(isAdmin);
		cyMember.setImgName(imgName);
		HttpSession session = req.getSession();
		session.setAttribute("id", id);
		
		
		try {
			cymemberDAO.CreateMember(cyMember);
			resp.sendRedirect("login.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendRedirect("error.jsp");
		}
	}
}
