package sec02;

import java.util.Scanner;

public class 연필 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("학생 수는?");
		int student = s.nextInt();
		System.out.println("연필 개수는?");
		int pencil = s.nextInt();

		int result = pencil / student;
		int result1 = pencil % student;
		// System.out.println("학생 한 명당 " + result + "개씩 연필을 가져가고 " + result1 + "개가 남아요");

		// 방법2
		System.out.printf("학생 한 명당 %d 개씩 연필을 가져가고 %d 개가 남아요", result, result1);
	}

}
