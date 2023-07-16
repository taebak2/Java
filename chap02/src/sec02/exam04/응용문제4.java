package sec02.exam04;

import java.util.Scanner;

public class 응용문제4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = s.next(); // 이름
		System.out.println("나이를 입력하세요");
		int age = s.nextInt(); // 나이

		System.out.print(name + "님은");
		if (age < 20) {
			System.out.println(" 청년입니다.");

		} else {
			System.out.println(" 장년입니다.");
		}
	}
}
