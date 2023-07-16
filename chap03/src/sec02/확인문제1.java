package sec02;

public class 확인문제1 {

	public static void main(String[] args) {
		byte b = 5;
		// b = -b;// - 연산자 붙으면 int로 인식
		// 1)
		int a = -b;
		int result = 10 / -a;
		System.out.println(result);

		// 2)
		// b = (byte)-b; (강제 형변환)
		// int result = 10 / -b;
		// System.out.println(result);

	}

}
