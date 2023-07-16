package sec02;

import java.util.Scanner;

public class 시험성적 {

	// 비밀번호는 영어 소문자와 숫자의 조합 a5, b7
	// 사용자가 비밀번호를 제대로 입력했으면 환영합니다 출력
	// 사용자가 비밀번호를 틀리게 입력했으면
	// 비밀번호는 영어 소문자와 숫자의 조합입니다. 안내문 출력

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("당신의 이름은?");
		String name = s.next();
		System.out.println("접속 비밀번호를 입력해 주세요");
		String pass = s.next();
		// pass.charAt(0);
		// if((pass.charAt(0) == 'k') & ((pass.charAt(1) == 'm')) & (pass.charAt(2) ==
		// 's') & (pass.charAt(3) == '1')){"환영합니다"

		// } else {
		// System.out.println("비밀번호는 영어 소문자와 숫자의 조합입니다. ");
		char a = pass.charAt(0);
		char b = pass.charAt(1);
		if ((a >= 97) && (a <= 122) && (b >= 48) && (b >= 57)) {
			System.out.println(name + "님 환영합니다.");
		} else {
			System.out.println("비밀번호는 영어 소문자와 숫자의 조합입니다.");
		}

		System.out.println("중간고사 성적을 입력해 주세요");
		int mid = s.nextInt();
		System.out.println("기말고사 성적을 입력해 주세요");
		int last = s.nextInt();

		if (mid >= 80 | last >= 80) {
			System.out.println("통과");
		} else {
			System.out.println("탈락");
		}
		// 중간고사가 80점 이상이거나 기말고사가 80점 이상이면 "통과"
		// 아니면 "탈락"
	}

}
