package sec02;

import java.util.Scanner;

public class teamStudy3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("학생수?");
		int student = s.nextInt();
		System.out.println("한 줄에 몇명씩 앉나요?");
		int line = s.nextInt();
		
		int a = student / line;
		int b = student % line;
		
		// 방법 3 삼항 연산자 이용 = 좌석 수, 남은 자리

		if (b!=0) {
			a++; b= line - b;
		} 
		System.out.printf("총 %d 줄에 앉았고, 남은 좌석은 %d 입니다.", a, b );


	}

}
