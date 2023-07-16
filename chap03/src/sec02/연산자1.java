package sec02;

public class 연산자1 {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;

		System.out.println(result1);
		System.out.println(result2);

		byte b = 100;
		// byte result = -b; // byte에 - 붙이면 int값으로 변경됨
		int result = -b;
		System.out.println(result); // -100
	}

}
