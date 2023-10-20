package mem;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.mvctestDAO;
import dto.mvctestDTO;


public class login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		mvctestDAO dao = new mvctestDAO();
		mvctestDTO dto = dao.check(id, pw);
		dao.close();
		if(dto.getName()!=null) {							
			request.setAttribute("dto", dto.getName());	
			
		// 방법 1
		// 로그인 성공 하면
		// name이라는 변수명 생성 + dao에서 선언한 setName을 가져옴 
			
		// 방법 2
		// HttpSession session = request.getSession();
		// session.setAttribute("dto",dto); 
		// request는 한 페이지 넘어갈때까지만 저장
		// session은 서버를 끌때까지 저장가능 
		// 그래서 session으로 설정해야 계속 유지가 된다~
			
			request.getRequestDispatcher("login.jsp").forward(request, response);	// login.jsp에서 EL태그 사용 가능 
		} else {
			request.getRequestDispatcher("login.jsp?error=1").forward(request, response);
		}
		
		// attribute vs parameter 
		// attribute 선언 : 바로 사용 가능
		// parameter 선언 : ${param.xx}로 작성해야 사용할 수 있음 
		
	}

}
