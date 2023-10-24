package mvc.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
		String requestURI = request.getRequestURI(); 	// URI는 주소 일부 반환, URL은 전체 반환
		String contextPath = request.getContextPath();	// 웹 애플리케이션의 루트 경로
		String command = requestURI.substring(contextPath.length()); 
		// requestURI에서 contextPath의 길이만큼을 잘라내어 command 변수에 저장
		// 예를 들어/myapp/BoardListAction.do에서 / BoardListAction.do만 저장

		response.setContentType("text/html;charset=utf-8");  // 응답의 콘텐츠 타입을 HTML로 설정하고 문자 인코딩을 UTF-8로 지정
		request.setCharacterEncoding("utf-8"); 				 // 요청의 문자 인코딩을 UTF-8로 설정

		if (command.equals("/BoardListAction.do")) { 	 	 // 등록된 글 출력하기
			requestBoard(request);							 // 게시판 데이터 요청 
			request.getRequestDispatcher("./board/list.jsp").forward(request, response);
			
		} else if (command.equals("/BoardWriteForm.do")) { 	 // 글 등록 페이지 출력함
			request.getRequestDispatcher("./board/write.jsp").forward(request, response);
			
		} else if (command.equals("/BoardWriteAction.do")) { // 서버에 새로운 글을 등록함
			requestBoardWrite(request);
			request.getRequestDispatcher("/BoardListAction.do").forward(request, response);
		}
		  else if (command.equals("/BoardViewAction.do")) { // 게시판 세부내용 출력
			requestBoardView(request);
			request.getRequestDispatcher("/board/view.jsp").forward(request, response);
		}
		  else if (command.equals("/BoardUpdateAction.do")) { // 게시판 글 수정
			requestBoardUpdate(request);
			request.getRequestDispatcher("/BoardListAction.do").forward(request, response);
		} /*
			 * else if (command.equals("/BoardDeleteAction.do")) { // 게시판 글 삭제
			 * 
			 * }
			 */
}

	public void requestBoard(HttpServletRequest request) {	// 등록된 글 목록 가져오기
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		
		int pageNum = 1;
		int limit = LISTCOUNT;
		
		if(request.getParameter("pageNum")!=null) {
			pageNum = Integer.parseInt(request.getParameter("pageNum"));
		}
		
		String items = request.getParameter("items");
		String text = request.getParameter("text");
		
		
		int total_record = dao.getListCount(items, text);
		boardlist = dao.getBoardList(pageNum, limit, items, text);
		dao.close();
		// 페이지개수, 한 화면에 표시할 행 개수, 검색 항목, 검색 내용을 boardList에 대입
		
		int total_page;
		if(total_record % limit == 0) {
			total_page = total_record/limit;
			Math.floor(total_page);
		} else {
			total_page = total_record/limit;
			Math.floor(total_page);
			total_page = total_page + 1;
		}
		
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("total_page", total_page);
		request.setAttribute("total_record", total_record);
		request.setAttribute("boardlist", boardlist);
		
	}
	public void requestBoardWrite(HttpServletRequest request) {
		String id = request.getParameter("id");
		String name= request.getParameter("name");
		String subject = request.getParameter("subject");
		String content= request.getParameter("content");
		
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = new BoardDTO();
		
		dto.setId(id);
		dto.setName(name);
		dto.setSubject(subject);
		dto.setContent(content);
		dto.setHit(0);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		dto.setRegist_day(sdf.format(date));	// 오늘 날짜 입력
		dto.setIp(request.getRemoteAddr());	// IP 주소 = 현재 컴퓨터의 IP 주소 입력 
		dao.insertWrite(dto);
		dao.close();
		
	} 
	
	public void requestBoardView(HttpServletRequest request) {
		BoardDAO dao = new BoardDAO();
		int num = Integer.parseInt(request.getParameter("num"));
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		
		BoardDTO board = new BoardDTO();
		board = dao.getBoardByNum(num);	// dao 메서드를 이용해 상세 내용 가져오기
		dao.close();
		request.setAttribute("num", num);
		request.setAttribute("page", pageNum);
		request.setAttribute("board", board);
		
		// 게시물 번호와 현재 페이지 번호를 이용하여 
		// 해당 게시물의 정보를 데이터베이스에서 가져와서, 
		// 그 정보를 뷰 페이지로 전달하는 역할
	
		
	}
	
	public void requestBoardUpdate(HttpServletRequest request) {
		int num = Integer.parseInt(request.getParameter("num"));
		
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = new BoardDTO();
		// DTO, DAO 객체를 각각 생성함
		
		dto.setNum(num);
		dto.setSubject(request.getParameter("subject"));
		dto.setContent(request.getParameter("content"));
		dao.updateBoard(dto);
		dao.close();
	}
}
