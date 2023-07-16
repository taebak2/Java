package sec02;

import java.util.Scanner;

public class switch문예제1 {

	public static void main(String[] args) {

		/*
		 * char a = '1'; int b = Character.getNumericValue(a); System.out.println(b);
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("광주시립도서관 방문을 환영합니다.");
		boolean run = true;
		String code;
		int d;
		int sum = 0;
		// A12는 대출, B는 반납, C는 종료

		while (run) {
			System.out.println("작업코드와 개수를 입력해 주세요");
			code = s.next();

			switch (code.charAt(0)) {
			case 'A':
			case 'a':
				d = Integer.parseInt(code.substring(1)); //
				System.out.println("책 " + d + "권 대출");
				sum += d;
				System.out.println("현재 대출 권수는 " + sum + "입니다.");
				break;
			case 'B':
			case 'b':
				d = Integer.parseInt(code.substring(1));
				System.out.println("책 " + d + "권 반납");
				sum -= d;
				System.out.println("현재 대출 권수는 " + sum + "입니다.");
				break;
			case 'c':
			case 'C':
				System.out.println("종료");
				run = false;
				System.out.println("총 대출 권수는" + sum + "입니다.");
			}
		}
	}
}