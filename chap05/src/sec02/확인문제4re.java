package sec02;

import java.util.Scanner;

public class 확인문제4re {

	public static void main(String[] args) {

		// 사용자로부터 배열 개수 입력받으세요, 배열 개수만큼 숫자를 입력 받아서 배열에 삽입하세요, 해당 배열에서 가장 작은 숫자를 출력하세요, 단
		// 숫자는 양수만 가능

		Scanner s = new Scanner(System.in);
		System.out.println("배열 개수를 입력하세요");
		int num[] = new int[s.nextInt()];
		for (int i = 0; i < num.length; i++) {
			System.out.println("숫자를 입력하세요");
			num[i] = s.nextInt();
			int min = num[0];
			for (int j = 0; j < num.length; j++) {
				if (min > num[j]) {
					min = num[j];
				}

			}
			System.out.println("최소값 : " + min);
		}
	}

}
