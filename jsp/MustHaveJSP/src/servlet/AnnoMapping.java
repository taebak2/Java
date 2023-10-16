package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/13Servlet/AnnoMapping.do")	// Annotation으로 매핑하는 방식 
public class AnnoMapping extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	// jsp의 method가 post, get이냐에 따라서 메서드 설정 
		request.setAttribute("message", "웹서블릿으로 매핑");
		request.getRequestDispatcher("/13Servlet/AnnoMapping.jsp").forward(request, response);
	}



}
