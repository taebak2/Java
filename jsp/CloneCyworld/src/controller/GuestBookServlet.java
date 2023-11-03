package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.guestbook;
import model.guestbookDAO;

public class GuestBookServlet extends HttpServlet {
       
    public GuestBookServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String content = request.getParameter("content");
		String owner_id = request.getParameter("owner_id");
		
		guestbook gbook = new guestbook();
		
		gbook.setId(id);
		gbook.setContent(content);
		gbook.setOwner_id(owner_id);
		
		guestbookDAO dao = new guestbookDAO();
		int result = 0;
		try {
			result = dao.Write(gbook);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		dao.close();
		
		if(result==1) {
			response.sendRedirect("guestbook.jsp?owner_id="+owner_id);
		} else {
			System.out.println("글쓰기에 실패했습니다.");
		}
		
		
	}

}
