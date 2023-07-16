package sec03.exam07;

import java.util.Scanner;

public class 문자를기본타입으로변환 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요");
		String a = s.next();
		System.out.println("두번째 수를 입력하세요");
		String b = s.next();

		int value = Integer.parseInt(a); // Integer.parseInt(); = 문자열을 int값으로
		int values = Integer.parseInt(b);

		int c = value + values;

		System.out.println("두 숫자의 합계는 " + c + " 입니다.");

		// String.valueOf(타입값) = 타입값 -> 문자로 변환
	}

}
