package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DirectServletPrint extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");	// 응답의 컨텐츠 타입과 문자 인코딩을 설정
		PrintWriter writer = response.getWriter();		// jsp에서 자바 text 사용할 때 쓰는 객체
		
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h2>서블릿에서 직접 출력</h2>");
		writer.println("</body>");
		writer.println("<html>");
	}
}
