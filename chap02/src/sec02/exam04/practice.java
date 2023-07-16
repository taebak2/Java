package sec02.exam04;

public class practice {

	public static void main(String[] args) {
		byte a = 10;
		int b = a;
		System.out.println(b);

		long longValue = 5000000000L; // 숫자는 정수 but long 타입은 실수라 실수로 인식
		System.out.println(longValue);
		
		double doubleValue = longValue; 
		System.out.println(doubleValue);
		
		byte byteValue = 65;
		//char charValue = byteValue; byte 타입은 char 타입으로 변환 x : byte 타입은 음수를 포함하기 때문에 
		
	}

}
