package utils;

public class BoardPage {

	public static String pagingStr(int totalCount, int pageSize, int blockPage, int pageNum, String reqUrl) {

		String pagingStr = "";

		int totalPages = (int) (Math.ceil(((double) totalCount / pageSize)));
		// 전체 페이지 수

		// 1~5페이지 일때 pageTemp는 1
		// 6~10페이지 일때 pageTemp는 6
		// 11~15페이지 일때 pageTemp는 11
		// 첫 페이지와 이전 블럭 출력 
		int pageTemp = (((pageNum - 1) / blockPage) * blockPage) + 1;
		if (pageTemp != 1) {
			pagingStr += "<a href='" + reqUrl + "?pageNum=1'>[첫 페이지]</a>";
			pagingStr += "&nbsp;";
			pagingStr += "<a href='" + reqUrl + "?pageNum=" + (pageTemp - 1) + "'>[이전 블럭]</a>";
		}
		//	현재 페이지가 첫 번째 블록에 속하지 않는 경우에 "첫 페이지"와 "이전 블록" 링크를 생성
		
		int blockCount = 1;
		while (blockCount <= blockPage && pageTemp <= totalPages) {
			if (pageTemp == pageNum) {
				pagingStr += "&nbsp;<a style='color:red;'>" + pageTemp + "&nbsp;";
			} else {
				pagingStr += "&nbsp;<a style='color:black;' href='" + reqUrl + "?pageNum=" + pageTemp + "'>" + pageTemp + "</a>&nbsp;";
			}
			pageTemp++;
			blockCount++;
		}
		
		//	다음 블록, 마지막 페이지 출력
		if(pageTemp <= totalPages)
			pagingStr += "<a href='" + reqUrl + "?pageNum=" + pageTemp + "'>[다음 블럭]</a>";
			pagingStr += "&nbsp;";
			pagingStr += "<a href='" + reqUrl + "?pageNum=" + totalPages + "'>[마지막 페이지]</a>";
			
			
		return pagingStr;

	}
}
