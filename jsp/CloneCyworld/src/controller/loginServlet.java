package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.member;
import model.memberDAO;

public class loginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("pw");
		memberDAO cyMemberDAO = new memberDAO();
		int result = 0;

		try {
			int hasId = cyMemberDAO.CheckDuplicateId(id);
			if(hasId==0) {
				response.sendRedirect("login.jsp?error=1");
				return;
			}
			member member = cyMemberDAO.loginCheck(id, password);
			if(member.getPassword()==null) {
				response.sendRedirect("login.jsp?error=2");
				return;
			}
			request.getSession().setAttribute("id", id);
			response.sendRedirect("home.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
