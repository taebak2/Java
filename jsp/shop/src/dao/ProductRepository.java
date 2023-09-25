package dao;

import java.util.ArrayList;

import common.JDBConnect;
import dto.Product;

public class ProductRepository extends JDBConnect {

	private ArrayList<Product> listOfProducts = new ArrayList<>();
	// listOfProducts : 전체 상품 정보를 담고 있음

	// 기본 생성자로 DB연결
	public ProductRepository() {
		super();
	}

	// DB에 있는 자료로 상품 목록 생성
	public void selectProduct() { // DB에 들어있는 정보 다 뽑아옴
		String query = "select * from product";
		try {
			psmt = con.prepareStatement(query);
			rs = psmt.executeQuery();

			while (rs.next()) {
				Product dto = new Product();
				dto.setProductId(rs.getString(1));
				dto.setPname(rs.getString(2));
				dto.setUnitPrice(rs.getInt(3));
				dto.setDescription(rs.getString(4));
				dto.setCategory(rs.getString(5));
				dto.setManufacturer(rs.getString(6));
				dto.setUnitsInStock(rs.getLong(7));
				dto.setCondition(rs.getString(8));
				listOfProducts.add(dto); // db에 있는 정보를 목록에 집어넣음

			}
		} catch (Exception e) {
			
		}
	}

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}

	public Product getProductById(String productId) {
		
		Product productById = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}

	// 상품 추가 메서드 
	public int addProduct(Product product) {
		int result = 0;
		String sql = "insert into product values(?,?,?,?,?,?,?,?)";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, product.getProductId());
			psmt.setString(2, product.getPname());
			psmt.setInt(3, product.getUnitPrice());
			psmt.setString(4, product.getDescription());
			psmt.setString(5, product.getCategory());
			psmt.setString(6, product.getManufacturer());
			psmt.setLong(7, product.getUnitsInStock());
			psmt.setString(8, product.getCondition());
			result = psmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("상품 추가하기 오류");
			e.printStackTrace();
		}
		return result;
	}

	public int deleteProduct(String pid) { // DB에 들어있는 정보 다 뽑아옴
		int result=0;
		String query = "delete from product where p_id=?";
		
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, pid);
			result = psmt.executeUpdate();
			System.out.println("상품삭제 성공");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("게시물 삭제 실패");
		}
		return result;
	}
}
