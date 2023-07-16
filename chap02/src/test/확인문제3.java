package test;

import java.util.Scanner;

public class 확인문제3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 수 :");
		int a = s.nextInt();
		System.out.println("두 번째 수 :");
		int b = s.nextInt();

		// if (a > b) {
		// System.out.println("뺄셈 결과 : " + (a - b));
		// } else {
		// System.out.println("덧셈 결과 : " + (a + b));
		// }

		int result;
		if (a > b) {
			result = a - b;
			System.out.println("뺄셈 결과 : " + result);
		} else {
			result = a + b;
			System.out.println("덧셈 결과 : " + result);
		}

	}

}
