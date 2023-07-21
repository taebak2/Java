package sec01;

import java.util.Scanner;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = "데이터베이스";
		int num = 5;
		System.out.println(data.toString()); // toString : 객체가 가지고 있는 정보, 값들을 String으로 리턴 String.valueOf와 유사
		System.out.println(data.charAt(1));
		// System.out.println(num.toString()); // num 값이 int라서 에러(일반 예외)
		
		//String data1 = null;
		//System.out.println(data1.toString());//(실행 예외: NullPointerException = 변수가 null이라서 발생하는 오류)
											 // String.valueOf vs toString = Null 값에 대한 결과가 다름, ??
		
		
		
	}

}
