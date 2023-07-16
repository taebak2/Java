package sec01;

import java.util.Scanner;

public class SwitchDiceExample1 {

	public static void main(String[] args) {

		int time = (int) (Math.random() * 4) + 8; // 8~ 11 중 하나의 수를 뽑기

		switch (time) {
		case 8:
			System.out.println("8 : 출근합니다");
			break;
		case 9:
			System.out.println("9 : 회의를 합니다");
			break;
		case 10:
			System.out.println("10 : 업무를 봅니다");
			break;
		case 11:
			System.out.println("11 : 외근을 나갑니다");
			break;

		}
	}

}
