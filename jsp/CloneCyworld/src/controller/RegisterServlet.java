package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String email = req.getParameter("email") + "@" + req.getParameterValues("com")[0];
		String phone = req.getParameterValues("phone-1")[0] +
				"-" + req.getParameter("phone-2") + "-" + req.getParameter("phone-3");
		String isAdmin = req.getParameter("grant");
		
		member cyMember = new member();
		cyMember.setId(id);
		cyMember.setPassword(pw);
		cyMember.setEmail(email);
		cyMember.setPhone(phone);
		cyMember.setIsAdmin(isAdmin);
		HttpSession session = req.getSession();
		session.setAttribute("id", id);
		
		try {
			cymemberDAO.CreateMember(cyMember);
			resp.sendRedirect("RegisterSuccess.jsp");
			// req.getRequestDispatcher vs sendRedirect
			// URL에 servlet 노출 여부 차이
			
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendRedirect("Error.jsp");
			
			
		}
	}
}
