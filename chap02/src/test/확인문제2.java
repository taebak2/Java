package test;

import java.util.Scanner;

public class 확인문제2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 수 :");
		String strNum1 = s.next();
		System.out.println("두 번째 수 :");
		String strNum2 = s.next();

		int num1 = Integer.parseInt(strNum1); // int result = Integer.parseInt(strNum1) + Integer.parseInt(strNum2);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
	}

}
