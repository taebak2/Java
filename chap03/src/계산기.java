package sec02;

import java.util.Scanner;

public class 계산기 {
// 큰 수에서 작은수 연산 -, /
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("첫 번째 숫자를 입력하세요");
		int a = s.nextInt();

		System.out.println("두 번째 숫자를 입력하세요");
		int b = s.nextInt();

		System.out.println("연산자(+,-,*,/)를 입력하세요");
		String c = s.next();

		if (c.equals("-")) {
			if (a > b) {
				System.out.println(a - b);
			}

		}
		if (c.equals("-")) {
			if (a < b) {
				System.out.println(b - a);
			}
		}
		if (c.equals("/")) {
			if (a > b) {
				System.out.println((double)a / b);
			}
		}
		if (c.equals("/")) {
			if (a < b) {
				System.out.println((double)b / a);
			}
		}

		if (c.equals("+")) {
			System.out.println(a + b);
		}
		if (c.equals("*")) {
			System.out.println(a * b);
		}
	}

}
