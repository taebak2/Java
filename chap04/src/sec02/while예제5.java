package sec02;

import java.util.Scanner;

public class while예제5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 하나를 입력하세요(1~10)");

		int userNum = s.nextInt();
		int num = (int) (Math.random() * 10) + 1; // 랜덤으로 숫자 추출 (1~10)

		// 스무 고개를 작성하세요
		if (userNum == num) {
			System.out.println("컴퓨터 숫자 : " + num);
			System.out.println("사용자 숫자 : " + userNum);
			System.out.println("정답입니다.");
		}

		else {
			System.out.println("컴퓨터 숫자 : " + num);
			System.out.println("사용자 숫자 : " + userNum);
			System.out.println("오답입니다.");
		}
	}

}
