package sec02;

import java.util.Scanner;

public class switch������1 {

	public static void main(String[] args) {

		/*
		 * char a = '1'; int b = Character.getNumericValue(a); System.out.println(b);
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("���ֽø������� �湮�� ȯ���մϴ�.");
		boolean run = true;
		String code;
		int d;
		int sum = 0;
		// A12�� ����, B�� �ݳ�, C�� ����

		while (run) {
			System.out.println("�۾��ڵ�� ������ �Է��� �ּ���");
			code = s.next();

			switch (code.charAt(0)) {
			case 'A':
			case 'a':
				d = Integer.parseInt(code.substring(1)); //
				System.out.println("å " + d + "�� ����");
				sum += d;
				System.out.println("���� ���� �Ǽ��� " + sum + "�Դϴ�.");
				break;
			case 'B':
			case 'b':
				d = Integer.parseInt(code.substring(1));
				System.out.println("å " + d + "�� �ݳ�");
				sum -= d;
				System.out.println("���� ���� �Ǽ��� " + sum + "�Դϴ�.");
				break;
			case 'c':
			case 'C':
				System.out.println("����");
				run = false;
				System.out.println("�� ���� �Ǽ���" + sum + "�Դϴ�.");
			}
		}
	}
}