package sec02;

import java.util.Scanner;

public class teamStudy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("학생수?");
		int count = s.nextInt();
		System.out.println("한 줄에 몇명씩 앉나요?");
		int line = s.nextInt();

		// 방법 1
		if (count % line == 0) {
			System.out.println("총 " + (count / line) + "줄이고 " + "남은 좌석 수는 " + (line - (count % line)) + "개 입니다");
		} else {
			System.out.println("총 " + ((count / line) + 1) + "줄이고 " + "남은 좌석 수는 " + (line - (count % line)) + "개 입니다");
		}

	}

}
