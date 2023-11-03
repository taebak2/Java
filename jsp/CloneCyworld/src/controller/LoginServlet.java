package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.memberDAO;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		memberDAO cyMemberDAO = new memberDAO();
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		int result = cyMemberDAO.CyworldLogin(id, pw);
		HttpSession session = req.getSession();
		
		if (result == 1) {
			session.setAttribute("loginUserId", id);
			resp.sendRedirect("home.jsp?id=" + id);
		} else if (result == 0) {
			session.setAttribute("message", "비밀번호가 맞지 않습니다.");
			resp.sendRedirect("login.jsp");
		} else if (result == -1) {
			session.setAttribute("message", "존재하지 않는 아이디입니다.");
			resp.sendRedirect("login.jsp");
		}
		
//		} else if (result == 0) {
//			req.setAttribute("message", "비밀번호가 맞지 않습니다.");
//			req.getRequestDispatcher("login.jsp").forward(req, resp);
//		} else if (result == -1) {
//			req.setAttribute("message", "존재하지 않는 아이디입니다.");
//			req.getRequestDispatcher("login.jsp").forward(req, resp);
//		}
	}
}
