package sec02;

import java.util.Scanner;

public class 조건문1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		if (a >= 80) {
			System.out.println("a의 값은 : " + a);
			System.out.println("a는 80이상입니다");
		} else {
			System.out.println("a의 값은 : " + a);
			System.out.println("a는 80미만입니다");

		}
	}
}
