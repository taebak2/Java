package sec03.exam07;

public class 확인문제 {

	public static void main(String[] args) {

		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";

		double var = (byte) intValue;
		byte var2 = (byte) intValue;
		int var3 = (int) doubleValue;
		char var4 = strValue.charAt(0);

		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue2 = 2.5;

		// byte result = byteValue + byteValue; 연산 하는 순간 int 타입으로 변경
		int result = byteValue + byteValue;

		char c1 = 'a';
		int c2 = c1 + 1; // char 연산했기 때문에 int로 먼저 받고 출력시, char로 변환
		System.out.println((char) c2);

		int x = 5;
		int y = 2;
		double results = (double) x / y;
		System.out.println(results); // 2.5 출력

		double var5 = 3.5;
		double var6 = 2.7;
		int resultss = (int) var5 + (int) var6; // 6으로 나오게 하는방법?
		System.out.println(resultss);

		
		
	}

}
