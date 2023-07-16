package sec02;

import java.util.Scanner;

public class 다차원배열문제연습rre {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// 반복문 이용해 3명의 이름을 입력 받으세요
		String name[] = new String[3];
		for (int i = 0; i < name.length; i++) {
			System.out.println((i + 1) + "번째 사람 이름을 입력하세요");
			name[i] = s.next();
		}

		int[][] num = new int[3][2]; // 3줄 2칸 짜리 배열 생성
		double[] result = new double[3];
		for (int k = 0; k < num.length; k++) {
			int sum = 0; // 사람이 바뀔때마다 합계 초기화
			for (int i = 0; i < num[k].length; i++) {

				if (i == 0) { // 첫번째 입력값이면 중간고사, 두번째는 기말고사
					System.out.println(name[i] + "의 중간점수를 입력하세요");
				} else {
					System.out.println(name[i] + "의 기말점수를 입력하세요");
				}
				num[k][i] = s.nextInt(); // 각각 위치에 값 삽입
				sum += num[k][i]; // 각 사람의 합계값 계산
			}
			result[k] = (double) sum / 2; // 각각의 평균값 구한후 result 배열에 삽입 
		}
		// 3명의 평균값 출력
		for (int i = 0; i < 3; i++) {
			System.out.println(name[i] + "의 평균 점수는 " + result[i] + "입니다.");
		}
	}
	
}