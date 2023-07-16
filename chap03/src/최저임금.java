package sec02;

import java.util.Scanner;

public class 최저임금 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("근로시간을 입력하세요");
		int fee = s.nextInt();
		System.out.println("1시간당 9620원 입니다");
		double result = (fee >= 10) ? 1.2 * 9260 * fee : fee * 9260;
		System.out.println("총 임금은 " + (int) result + "원 입니다.");

	}

}
