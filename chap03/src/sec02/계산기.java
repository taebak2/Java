package sec02;

import java.util.Scanner;

public class ���� {
// ū ������ ������ ���� -, /
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("ù ��° ���ڸ� �Է��ϼ���");
		int a = s.nextInt();

		System.out.println("�� ��° ���ڸ� �Է��ϼ���");
		int b = s.nextInt();

		System.out.println("������(+,-,*,/)�� �Է��ϼ���");
		String c = s.next();

		if (c.equals("-")) {
			if (a > b) {
				System.out.println(a - b);
			}

		}
		if (c.equals("-")) {
			if (a < b) {
				System.out.println(b - a);
			}
		}
		if (c.equals("/")) {
			if (a > b) {
				System.out.println((double)a / b);
			}
		}
		if (c.equals("/")) {
			if (a < b) {
				System.out.println((double)b / a);
			}
		}

		if (c.equals("+")) {
			System.out.println(a + b);
		}
		if (c.equals("*")) {
			System.out.println(a * b);
		}
	}

}
