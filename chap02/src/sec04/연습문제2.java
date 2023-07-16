package sec04;

import java.util.Scanner;

public class 연습문제2 {

	public static void main(String[] args) {
		// 도어락 비밀번호를 입력하세요
		// 비밀번호 : 1234
		// 만약 비밀번호를 잘못 입력했으면 => 비밀번호가 틀립니다.
		// 제대로 = 환영합니다.

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("도어락 비밀번호를 입력하세요");
			String password = s.nextLine(); //nextline은 next와 달리 띄어쓰기 인식 가능 
			if (password.equals("1234")) {
				System.out.println("환영합니다.");
				break;
			}

			System.out.println("비밀번호가 틀립니다.");

		}
	}
}
