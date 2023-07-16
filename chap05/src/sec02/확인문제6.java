package sec02;

import java.util.Scanner;

public class 확인문제6 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner s = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------------");
			System.out.print("선택> ");

			s.nextLine();
			int selectNo = Integer.parseInt(s.nextLine()); //

			if (selectNo == 1) {
				System.out.print("학생 수>");
				studentNum = s.nextInt();
			} else if (selectNo == 2) {
				System.out.println("점수를 입력하세요");
				scores = new int[studentNum];
				for (int i = 0; i < studentNum; i++) {
					scores[i] = s.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println(scores[i]);
				}

			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0; // 합계 구할때는 무조건 0; 선언......
				for (int i = 0; i < studentNum; i++) {
					if (scores[i] > max) {
						max = scores[i];
					}
					sum += scores[i];
				}
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수 " + (sum / studentNum));

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
