package sec01;

import java.util.Scanner;

public class If연습2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
// 다중커서 alt + shift + a 
		System.out.println("숫자를 입력하세요");
		int num = s.nextInt();
		int num1 = s.nextInt();
		int num2 = s.nextInt();

		if (num > 6 && num1 > 6 && num2 > 6 && num + num1 + num2 >= 30) {
			System.out.println("국어 :" + num);
			System.out.println("수학 :" + num1);
			System.out.println("영어 :" + num2);
			System.out.println("합격입니다!");

		} else {
			System.out.println("국어 :" + num);
			System.out.println("수학 :" + num1);
			System.out.println("영어 :" + num2);
			System.out.println("불합격입니다!");
		}

		System.out.println("숫자를 입력하세요");
		int korea = s.nextInt();
		int math = s.nextInt();
		int english = s.nextInt();

		int sum = korea + math + english;

		if (korea <= 6 || math <= 6 || english <= 6 || sum < 30) {
			System.out.println("불합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}

	}

}
