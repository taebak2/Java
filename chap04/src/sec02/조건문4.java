package sec02;

import java.util.Scanner;

public class ���ǹ�4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �ڵ带 �Է����ּ���");
		String position = s.next();

		// �����ڵ��A����1234, B����4567, C����9874
		// A, B, C �λ��, ��ȹ��, �ѹ���
		// ���ʽ��ݾ� ���� 100����, ���� 70����, ���� 50����
		// ��) A����1234 -> �λ�� ����� ���ʽ��ݾ��� 1,000,000�� �Դϴ�.

		switch (position.charAt(0)) {
		case 'A':
		case 'a':
			System.out.print("�λ�� " + position.substring(1, 3));
			break;
		case 'B':
		case 'b':
			System.out.print("��ȹ�� " + position.substring(1, 3));
			break;
		default:
			System.out.print("�ѹ��� " + position.substring(1, 3));

		}
		switch (position.substring(1, 3)) {
		case "����":
			System.out.println("�� ���ʽ��ݾ��� 1,000,000�� �Դϴ�.");
			break;
		case "����":
			System.out.println("�� ���ʽ��ݾ��� 700,000�� �Դϴ�.");
			break;
		default:
			System.out.println("�� ���ʽ��ݾ��� 500,000�� �Դϴ�.");
		}
	}
}
