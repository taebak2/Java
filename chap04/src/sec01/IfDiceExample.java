package sec01;

import java.util.Scanner;

public class IfDiceExample {

	public static void main(String[] args) {
		// (Math.random() * 개수) + 초기값;

		Scanner s = new Scanner(System.in);
		int num = (int) (Math.random() * 6) + 1;
		int num2 = s.nextInt();

		if (num == num2) {
			System.out.println("두 수가 일치합니다.");
		} else if (num > num2) {
			System.out.println("컴퓨터 숫자가 더 큽니다.");

		} else if (num < num2) {
			System.out.println("사용자 숫자가 더 큽니다.");
		}

	}

}
