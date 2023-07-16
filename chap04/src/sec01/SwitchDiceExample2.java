package sec01;

import java.util.Scanner;

public class SwitchDiceExample2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("수험번호를 입력받습니다.");
		String num = s.next();
		switch (num.charAt(6)) {
		case 'A':
			System.out.println("시험장소가 201호입니다.");
			break;
		case 'B':
			System.out.println("시험장소가 202호입니다.");
			break;
		default:
			System.out.println("시험장소가 203호입니다.");
		}
	}

}
