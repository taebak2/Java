package sec02;

import java.util.Scanner;

public class 조건문4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("직원 코드를 입력해주세요");
		String position = s.next();

		// 직원코드는A부장1234, B과장4567, C차장9874
		// A, B, C 인사부, 기획부, 총무부
		// 보너스금액 부장 100만원, 과장 70만원, 차장 50만원
		// 예) A부장1234 -> 인사부 부장님 보너스금액은 1,000,000원 입니다.

		switch (position.charAt(0)) {
		case 'A':
		case 'a':
			System.out.print("인사부 " + position.substring(1, 3));
			break;
		case 'B':
		case 'b':
			System.out.print("기획부 " + position.substring(1, 3));
			break;
		default:
			System.out.print("총무부 " + position.substring(1, 3));

		}
		switch (position.substring(1, 3)) {
		case "부장":
			System.out.println("님 보너스금액은 1,000,000원 입니다.");
			break;
		case "과장":
			System.out.println("님 보너스금액은 700,000원 입니다.");
			break;
		default:
			System.out.println("님 보너스금액은 500,000원 입니다.");
		}
	}
}
