package servlet;

import java.io.IOException; 

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
   
import dao.MemberDAO;
import dto.MemberDTO;

public class loginCheck extends HttpServlet {

	MemberDAO dao;

	@Override
	public void init() throws ServletException {

		dao = new MemberDAO(); // MemberAuth.java에서 하는 방식대로 하려면
								// web.xml에 mysql 관련 param이 존재해야함
	}

	@Override
	public void destroy() {
		dao.close();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		String id = request.getParameter("id");
		String pass = request.getParameter("password");

		MemberDTO dto = dao.getMemberDTO(id, pass);

		String memberName = dto.getName();

		if (memberName != null) {
			session.setAttribute("user_id", dto.getId());
			session.setAttribute("user_name", dto.getName());
			session.setAttribute("user_pw", dto.getPass());
			request.setAttribute("loginCheck", memberName + "회원님 반갑습니다!");
			request.getRequestDispatcher("loginprocess.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("login.jsp?error=1").forward(request, response);
		}
	}
}
