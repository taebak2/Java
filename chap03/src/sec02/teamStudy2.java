package sec02;

import java.util.Scanner;

public class teamStudy2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�л���?");
		int count = s.nextInt();
		System.out.println("�� �ٿ� ��� �ɳ���?");
		int line = s.nextInt();
		
		// ��� 2
		
		double line1 = (double) count / (double) line;
		int line2 = count / line;

		if (line1-line2> 0) {
			line1++;
		}

		int resultline = (int) line1;
		int remainseat = resultline * count - line;
		System.out.printf("�� %d���̰� ���� �¼����� %d�Դϴ�.", resultline, remainseat);

	}

}
