<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.Product" %>
<%@ page import="dao.ProductRepository" %>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<% 	
	String saveDirectory = application.getRealPath("/resources/images");
	//	서버의 실제 파일 시스템 경로에서 /resources/images 디렉터리의 실제 경로를 가져오는 데 사용
	//	일반적으로 웹 애플리케이션에서 자원(예: 이미지 파일)을 저장하고 액세스할 때 사용
	int	maxSize = 1024 * 1024 * 5; // 5mb
	//	 업로드하려는 파일이 5MB를 초과하면 업로드가 거부
	String encoding = "utf-8";
	MultipartRequest mr = new MultipartRequest(request,saveDirectory,maxSize,encoding,new DefaultFileRenamePolicy());
	//	실제 파일 업로드를 처리
	//	MultipartRequest 객체를 생성하여 서블릿 요청 (request)에서 업로드된 파일을 실제 디렉터리 (realPath)로 저장 
	//	최대 파일 크기 (maxSize) 및 문자 인코딩 (encoding)을 설정
	//	DefaultFileRenamePolicy를 사용하여 중복 파일 이름을 처리해 충돌을 방지
	
	
	String productId = mr.getParameter("productId");
	String pname = mr.getParameter("pname");
	int unitPrice = Integer.parseInt(mr.getParameter("unitPrice"));
	String description = mr.getParameter("description");
	String manufacturer = mr.getParameter("manufacturer");
	String category = mr.getParameter("category");
	long unitsInStock = Long.parseLong(mr.getParameter("unitsInStock"));
	String condition = mr.getParameter("condition");
	String photoImage = mr.getFilesystemName("photoImage");
	
	File photoFile = new File(saveDirectory +File.separator + photoImage);	
	// 이 코드가 없어도 업로드 되던데 왜 사용하는지?
	// File.separator: 파일 시스템에서 디렉터리 경로를 구분하는 문자 ex) \
	// saveDirectory와 photoImage 변수를 조합하여 
	// 실제 파일의 전체 경로를 나타내는 File 객체를 생성
	
	ProductRepository pr = new ProductRepository();
	Product newProduct = new Product();
	newProduct.setProductId(productId);
	newProduct.setPname(pname);
	newProduct.setUnitPrice(unitPrice);
	newProduct.setDescription(description);
	newProduct.setManufacturer(manufacturer);
	newProduct.setCategory(category);
	newProduct.setUnitsInStock(unitsInStock);
	newProduct.setCondition(condition);
	newProduct.setProductImage(photoImage);	
	
	pr.addProduct(newProduct);
	response.sendRedirect("products.jsp");

%>