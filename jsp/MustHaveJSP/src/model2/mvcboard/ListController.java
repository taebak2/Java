package model2.mvcboard;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.BoardPage;


public class ListController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		MVCBoardDAO dao = new MVCBoardDAO(); // DB 접속
		
		Map<String, Object> map = new HashMap<>(); // 뷰에 전달할 매개변수 저장용 맵 생성
		String searchField = request.getParameter("searchField");
		String searchWord = request.getParameter("searchWord");
		if(searchWord != null) { // 쿼리스트링으로 전달받은 매개변수 중 검색어가 있다면 map에 저장
			map.put("searchField", searchField);
			map.put("searchWord", searchWord);
		}
		int totalCount = dao.selectCount(map); // 전체 게시물 개수 저장
		
		// 페이지 처리 start
		ServletContext application = getServletContext();	 
		int pageSize = Integer.parseInt(application.getInitParameter("POSTS_PER_PAGE"));	// 페이지당 게시물 수 
		int blockPage = Integer.parseInt(application.getInitParameter("PAGES_PER_BLOCK"));	// 블록당 페이지 수
		int pageNum = 1;	// 페이지 번호 초기값 설정
		String pageTemp = request.getParameter("pageNum");
		//	String pageTemp => int pageNum으로 바꾸는 이유는 
		//	Parameter값을 가져오는 것이 String밖에 안되기 때문
		//	사용자가 클릭한 페이지 번호를 가져와 pageNum에 저장함
		if(pageTemp!=null && !pageTemp.equals(""))
			pageNum = Integer.parseInt(pageTemp);	
		//	요청받은 페이지로 수정

		int start = (pageNum-1) * pageSize + 1;	// 1, 6, 11 ....
		int end = pageNum * pageSize;			// 10, 20, 30, 40 ....
		map.put("start", start);
		map.put("end", end);
		// 페이지 처리 end
		
		List<MVCBoardDTO> boardLists = dao.selectList(map);
		// dao 객체를 사용하여 데이터베이스에서 게시물 목록을 검색하고, 그 결과를 boardLists라는 List에 저장
		dao.close(); 
			
		String pagingImg = BoardPage.pagingStr(totalCount, pageSize, blockPage, pageNum, "../mvcboard/list.do");
		// 페이징 기능을 위해 BoardPage 클래스의 pagingStr 메서드를 사용하여 
		// 페이징 문자열(pagingImg)을 생성
		// 이 문자열은 페이지 이동 링크를 생성하는 데 사용
		map.put("pagingImg", pagingImg);
		map.put("totalCount", totalCount);
		map.put("pageSize", pageSize);
		map.put("pageNum", pageNum);
		// map에 페이징과 관련된 정보 및 다른 데이터를 저장
		// 나중에 JSP (JavaServer Pages) 파일에서 사용
		
		request.setAttribute("boardLists", boardLists);
		request.setAttribute("map", map);
		// boardLists와 map을 HTTP 요청의 속성으로 설정 
		// 이렇게 함으로써 JSP 파일에서 이 데이터에 접근 가능
		request.getRequestDispatcher("/09PagingBoard/List.jsp").forward(request,response);
	}

}
