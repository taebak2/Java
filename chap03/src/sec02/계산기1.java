package sec02;

import java.util.Scanner;

public class 계산기1 {
// 방법2// 바꿔치기
	// temp = a;
	// a = b;
	// b = temp;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("첫 번째 숫자를 입력하세요");
		int a = s.nextInt();

		System.out.println("두 번째 숫자를 입력하세요");
		int b = s.nextInt();

		System.out.println("연산자(+,-,*,/)를 입력하세요");
		String c = s.next();

		int temp; // 바꿔치기 위한 공간
		int result; // + - * 값
		double result2; // /값 소수점 때문에 double

		if (b > a) {
			temp = a;
			a = b;
			b = temp;

			if (c.equals("+")) {
				result = a + b;
				System.out.println("두 수의 합계는 : " + result + " 입니다");
			}

			if (c.equals("-")) {
				result = a - b;
				System.out.println("두 수의 뺄셈은 : " + result + " 입니다");
			}
			if (c.equals("*")) {
				result = a * b;
				System.out.println("두 수의 곱은 : " + result + " 입니다");

			}
			if (c.equals("/")) {
				result2 = (double) a / b;
				System.out.println("두 수의 나눈값은 : " + result2 + " 입니다");
			}
		}

	}

}
