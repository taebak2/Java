package sec02;

import java.util.Scanner;

public class 확인문제9re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력하세요");
		double num = Double.parseDouble(s.next());
		System.out.println("두 번째 수를 입력하세요");
		double num1 = Double.parseDouble(s.next());

		double result =  num / num1;
		if (num == 0.0) {

			System.out.println("결과: " + "무한대");
		} else {
			System.out.println("결과: " + result);
		}

	}

}
