package sec02;

import java.util.Scanner;

public class 배열복사3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[] person = new String[3];
		for (int i = 0; i < person.length; i++) {
			System.out.println("학생 이름을 입력해주세요.");
			person[i] = s.next();
		}
		String[] person2 = new String[5];
		System.arraycopy(person, 0, person2, 0, person.length);
		for (int i = 0; i < person2.length - 2; i++) {
			System.out.println(person2[i]);
			if (i >= 3) {
				person2[i] = "영수";

			}
		}

		// 사용자에게 3명의 이름을 입력받아 배열에 저장하세요
		// String 타입의 5개짜리 배열을 별도로 생성하세요.
		// 첫번째 배열에서 두번째 배열로 값을 복사하세요.

		// 두번째 배열에 철수, 영희,순희,null,null
		// 두번째 배열의 null 값을 영수로 채우세요

	}

}
