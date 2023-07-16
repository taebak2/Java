package sec02;

import java.util.Scanner;

public class 확인문제9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력하세요");
		String num = s.next();
		System.out.println("두 번째 수를 입력하세요");
		String num1 = s.next();

		double a = Double.parseDouble(num);
		double b = Double.parseDouble(num1);
		double result =  a / b;
		if (b == 0 | b == 0.0) {

			System.out.println("결과: " + "무한대");
		} else {
			System.out.println("결과: " + result);
		}

	}

}
