package sec02;

import java.util.Scanner;

public class teamStudy3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�л���?");
		int student = s.nextInt();
		System.out.println("�� �ٿ� ��� �ɳ���?");
		int line = s.nextInt();
		
		int a = student / line;
		int b = student % line;
		
		// ��� 3 ���� ������ �̿� = �¼� ��, ���� �ڸ�

		if (b!=0) {
			a++; b= line - b;
		} 
		System.out.printf("�� %d �ٿ� �ɾҰ�, ���� �¼��� %d �Դϴ�.", a, b );


	}

}
