package sec02;

import java.util.Scanner;

public class 조건문3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		System.out.println("사용자 코드를 입력해주세요");
		// A115, B113, C119, a115, b113, c110
		// 사용자 코드에서 맨 앞 영어 한 글자를 뽑아오세요.
		//shift tab은 왼쪽
	
		String code = s.next();
		switch (code.charAt(0)) {
		case 'a':
		case 'A':
			System.out.println("인사부에 배정되셨습니다.");
			break;
		case 'b':
		case 'B':
			System.out.println("기획부에 배정되셨습니다.");
			break;
		default:
			System.out.println("총무부에 배정되셨습니다.");

		}
	}
}
