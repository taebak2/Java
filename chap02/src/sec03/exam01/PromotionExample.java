package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue); // 작은 것에서 큰걸로 가능

		char charValue = '사';
		intValue = charValue;
		System.out.println("사의 유니코드 : " + intValue);

		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
	}
}
