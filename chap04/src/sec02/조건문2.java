package sec02;

import java.util.Scanner;

public class 조건문2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("1~3중 하나를 입력하세요");
		int a = s.nextInt();

		switch (a) {
		case 1:
		case 4:
			System.out.println("당신의 부서는 인사부입니다");
			break;
		case 2:
		case 5:
			System.out.println("당신의 부서는 기획부입니다");
			break;
		default:
			System.out.println("당신의 부서는 총무부입니다");
		}

	}
}
