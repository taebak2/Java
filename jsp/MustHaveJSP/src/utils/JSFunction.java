package utils;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter; // JspWriter는 JSP 페이지에서 출력을 생성하는 데 사용되는 클래스

public class JSFunction { 

	public static void alertLocation(String msg, String url, JspWriter out) { // out: JspWriter 객체로, 메서드에서 생성된 JavaScript 코드를 JSP 페이지에 출력하는 데 사용
		try {
			String script = ""
							+ "<script>"
							+ " alert('" + msg +"');"
							+ "location.href='"+ url +"';"
							+ "</script>";
			out.println(script);
		} catch (Exception e) {
		}
	}
	// JSP 페이지나 서블릿에서 JSFunction.alertLocation(msg, url, out);와 같은 형태로 호출해야 JSFunction 클래스를 사용할 수 있음
	
	public static void alertBack(String msg, JspWriter out) {
		try {
			String script = ""
					+ "<script>"
					+ " alert('" + msg +"');"
					+ "history.back();"	// 브라우저의 이전 페이지로 이동하는 JavaScript 코드
					+ "</script>";
			out.println(script);
		} catch (Exception e) {
		}
	}
	public static void alertLocation(HttpServletResponse resp,String msg, String url) { 
		try {
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter writer = resp.getWriter();
			String script = ""
							+ "<script>"
							+ " alert('" + msg +"');"
							+ "location.href='"+ url +"';"
							+ "</script>";
			writer.println(script);
		} catch (Exception e) {
		}
	}
	
	public static void alertBack(HttpServletResponse resp,String msg) { 
		try {
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter writer = resp.getWriter();
			String script = ""
							+ "<script>"
							+ " alert('" + msg +"');"
							+ " history.back()"
							+ "</script>";
			writer.println(script);
		} catch (Exception e) {
		}
	}
} 
