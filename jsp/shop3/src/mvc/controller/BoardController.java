package mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.model.BoardDAO;
import mvc.model.BoardDTO;

public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// Java 직렬화(Serialization)에서 사용되는 변수
	// 직렬화된 객체의 버전을 식별하는 데 사용
	
	static final int LISTCOUNT = 5;
	// 클래스 내에서 사용할 정적(static) 상수를 선언

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI(); // URI는 주소 일부 반환, URL은 전체 반환
		String contextPath = request.getContextPath();// 웹 애플리케이션의 루트 경로
		String command = requestURI.substring(contextPath.length()); 
		// requestURI에서 contextPath의 길이만큼을 잘라내어 command 변수에 저장
		// 예를 들어/myapp/BoardListAction.do에서 / BoardListAction.do만 저장

		response.setContentType("text/html;charset=utf-8"); // 응답의 콘텐츠 타입을 HTML로 설정하고 문자 인코딩을 UTF-8로 지정
		request.setCharacterEncoding("utf-8"); // 요청의 문자 인코딩을 UTF-8로 설정

		if (command.equals("/BoardListAction.do")) { // 등록된 글 출력하기
			requestBoard(request);	// 게시판 데이터 요청 
			RequestDispatcher rd = request.getRequestDispatcher("./board/list.jsp"); //  "list.jsp" 페이지로 포워딩
			rd.forward(request, response);
		} else if(command.equals("/BoardWriteAction.do")) {	// 새로운 글 쓰기
			
		}
	}

	public void requestBoard(HttpServletRequest request) {	// 등록된 글 목록 가져오기
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		
		int pageNum = 1;
		int limit = LISTCOUNT;	// 한 페이지에 표기할 글의 개수 
		
		if(request.getParameter("pageNum")!=null) {	//  페이지 번호가 제공되었는지 여부를 확인
			pageNum = Integer.parseInt(request.getParameter("pageNum"));
			
		String items = request.getParameter("items");
		String text = request.getParameter("text");
		// 목록 내에서 필터링 또는 검색을 수행하기 위해 사용
			
		int total_record = dao.getListCount(items, text);
		boardlist = dao.getBoardList(pageNum, limit, items, text);
		dao.close();
		// 페이지개수, 한 화면에 표시할 행 개수, 검색 항목, 검색 내용을 boardList에 대입
		
		int total_page;
		// 총 페이지 수	
		if(total_record % limit == 0) {		 // 게시물의 총 개수를 한 화면에 표시할 게시물 개수로 나눈 값 
			total_page = total_record/limit; // ex) 총 게시물 20개 한 화면에 5개씩 나타나면? => 총 페이지는 4 페이지 
							 // total_page = 4  
			Math.floor(total_page);
		} else {
			total_page = total_record/limit; // 게시물이 0으로 나눠떨어지지 않으면 1을 추가해야함
			Math.floor(total_page);
			total_page = total_page + 1;
		}
		
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("total_page", total_page);
		request.setAttribute("total_record", total_record);
		request.setAttribute("boardlist", boardlist);
		
		}
	}

}
