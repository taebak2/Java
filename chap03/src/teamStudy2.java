package sec02;

import java.util.Scanner;

public class teamStudy2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("학생수?");
		int count = s.nextInt();
		System.out.println("한 줄에 몇명씩 앉나요?");
		int line = s.nextInt();
		
		// 방법 2
		
		double line1 = (double) count / (double) line;
		int line2 = count / line;

		if (line1-line2> 0) {
			line1++;
		}

		int resultline = (int) line1;
		int remainseat = resultline * count - line;
		System.out.printf("총 %d줄이고 남은 좌석수는 %d입니다.", resultline, remainseat);

	}

}
