package sec02;

import java.util.Scanner;

public class 학습코드 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String code = s.next(); // 학습코드

		System.out.print("20" + code.substring(0, 2) + "년도 "); // 년도
		
		switch (code.charAt(2)) { // 과목
		case 'M':
		case 'm':
			System.out.print("수학 과목 신청자입니다");
			break;
		case 'K':
		case 'k':
			System.out.print("국어 과목 신청자입니다");
			break;
		default:
			System.out.print("영어 과목 신청자입니다");
 
		}
	}

}
