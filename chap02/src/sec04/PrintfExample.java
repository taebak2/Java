package sec04;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value); // 오른쪽으로 정렬, 왼쪽 공백
		int value2 = 1234;
		System.out.printf("상품의 가격:%d원\n", value2);
		System.out.printf("상품의 가격:%6d원\n", value2); 
		System.out.printf("상품의 가격:%-6d원\n", value2); // 왼쪽 정렬
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area); // 반지름이 정수(10)인 원의 넓이 : 소수점 이상 7자리, 소수점 이하 2자리, 왼쪽 빈 자리 공백
																		 // area는 double 값이라 f로 지정
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s| %10s\n", 1, name, job); // 10자리 문자열 오른쪽 공백, 10자리 문자열 왼쪽 공백
	}

}
