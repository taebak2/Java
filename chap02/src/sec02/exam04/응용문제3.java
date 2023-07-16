package sec02.exam04;

import java.util.Scanner;

public class 응용문제3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("두 개의 숫자를 입력하세요");
		System.out.println("몇층인가요?");
		int a = s.nextInt();
		System.out.println("거주 인원은 몇명인가요?");
		int b = s.nextInt();
		int c = a * 5;
		int d = b / 3;
		
		System.out.println("입력하신 건물은 전체 " + c + "m이고 " + "최대거주인원은 " + d + "명입니다");
		
		
		

	}

}
