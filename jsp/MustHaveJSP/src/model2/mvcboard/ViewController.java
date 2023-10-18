package model2.mvcboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mvcboard/view.do")	//	Annotation을 활용한 Mapping 방법
public class ViewController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 게시물 불러오기
		MVCBoardDAO dao = new MVCBoardDAO();
		String idx = request.getParameter("idx");
		dao.updateVisitCount(idx);
		MVCBoardDTO dto = dao.selectView(idx);
		dao.close();
		
		// 줄바꿈 처리
		dto.setContent(dto.getContent().replaceAll("\r\n", "<br>"));
		
		// 게시물 저장 후 뷰로 포워드
		request.setAttribute("dto", dto);
		request.getRequestDispatcher("/14MVCBoard/View.jsp").forward(request, response);
	}
}
