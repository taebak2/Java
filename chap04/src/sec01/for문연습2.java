package sec01;

import java.util.Scanner;

public class for문연습2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("정수 입력 1: ");
		int a = s.nextInt();
		System.out.println("정수 입력 2: ");
		int b = s.nextInt();

		int result;

		if (a > b) {
			result = a;
			a = b;
			b = result;
		}

		for (int i = a; i <= b; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}

		}

	}

}
