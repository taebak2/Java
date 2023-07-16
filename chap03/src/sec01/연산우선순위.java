package sec01;

import java.util.Scanner;

public class 연산우선순위 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("숫자 하나를 입력하세요");
		int num1 = s.nextInt();

		System.out.println("연산자 (+,-)를 입력하세요");
		String oper = s.next();

		// 만약 연산자가 +면 입력한 숫자에서 1을 증가시켜 출력하고
		// 연산자가 -면 입력한 숫자에서 1을 감소시켜 출력하세요

		if (oper.equals("+")) {
			System.out.println(++num1);
		} else {
			System.out.println(--num1);
		}
	}

}
