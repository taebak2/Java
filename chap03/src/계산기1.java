package sec02;

import java.util.Scanner;

public class ����1 {
// ���2// �ٲ�ġ��
	// temp = a;
	// a = b;
	// b = temp;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("ù ��° ���ڸ� �Է��ϼ���");
		int a = s.nextInt();

		System.out.println("�� ��° ���ڸ� �Է��ϼ���");
		int b = s.nextInt();

		System.out.println("������(+,-,*,/)�� �Է��ϼ���");
		String c = s.next();

		int temp; // �ٲ�ġ�� ���� ����
		int result; // + - * ��
		double result2; // /�� �Ҽ��� ������ double

		if (b > a) {
			temp = a;
			a = b;
			b = temp;

			if (c.equals("+")) {
				result = a + b;
				System.out.println("�� ���� �հ�� : " + result + " �Դϴ�");
			}

			if (c.equals("-")) {
				result = a - b;
				System.out.println("�� ���� ������ : " + result + " �Դϴ�");
			}
			if (c.equals("*")) {
				result = a * b;
				System.out.println("�� ���� ���� : " + result + " �Դϴ�");

			}
			if (c.equals("/")) {
				result2 = (double) a / b;
				System.out.println("�� ���� �������� : " + result2 + " �Դϴ�");
			}
		}

	}

}
