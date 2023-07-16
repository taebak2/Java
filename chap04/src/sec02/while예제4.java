package sec02;

import java.util.Scanner;

public class while예제4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = (int) (Math.random() * 20) + 1; // 랜덤으로 숫자 추출 (1~10)

		// 스무 고개를 작성하세요

		while (true) {
			System.out.println("숫자를 하나 입력하세요(1~20)");
			int userNum = s.nextInt();
			if (userNum == num) {
				System.out.println("정답입니다.");
				break;
			} else if (userNum > num) {
				System.out.println("입력 수가 더 커요. 작은 수를 입력하세요");
			} else {
				System.out.println("입력 수가 더 작아요. 큰 수를 입력하세요");
			}

		}
	}
}
