package sec01;

import java.util.Scanner;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("중간고사 성적은?");
		int mid = s.nextInt();
		System.out.println("기말고사 성적은?");
		int last = s.nextInt();

		double result = (mid + last) / 2;

		if (mid < 60 || last < 60) {
			System.out.println("재수강");
		}

		else if (result >= 90) {
			System.out.println("A학점");
		} else if (result >= 80) {
			System.out.println("B학점");

		} else if (result < 80) {
			System.out.println("C학점");
		}
	}
}
