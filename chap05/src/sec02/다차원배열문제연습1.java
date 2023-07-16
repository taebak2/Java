package sec02;

import java.util.Scanner;

public class 다차원배열문제연습1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// 반복문 이용해 3명의 이름을 입력 받으세요
		String name[] = new String[3];
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("이름을 입력하세요");
			name[i] = s.next();
		}

		int[][] num = new int[3][2]; // 3줄 2칸 짜리 배열 생성
		for (int k = 0; k < num.length; k++) {
			System.out.println("중간고사 성적을 입력하세요");
			int midScore = s.nextInt();
			System.out.println("기말고사 성적을 입력하세요");
			int lastScore = s.nextInt();
			


		}
		System.out.println(name[0] + "의 평균 점수는 " + (sum1 / 2) + "입니다.");
		System.out.println(name[1] + "의 평균 점수는 " + (sum2 / 2) + "입니다.");
		System.out.println(name[2] + "의 평균 점수는 " + (sum3 / 2) + "입니다.");
	}
}