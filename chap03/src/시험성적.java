package sec02;

import java.util.Scanner;

public class ���輺�� {

	// ��й�ȣ�� ���� �ҹ��ڿ� ������ ���� a5, b7
	// ����ڰ� ��й�ȣ�� ����� �Է������� ȯ���մϴ� ���
	// ����ڰ� ��й�ȣ�� Ʋ���� �Է�������
	// ��й�ȣ�� ���� �ҹ��ڿ� ������ �����Դϴ�. �ȳ��� ���

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("����� �̸���?");
		String name = s.next();
		System.out.println("���� ��й�ȣ�� �Է��� �ּ���");
		String pass = s.next();
		// pass.charAt(0);
		// if((pass.charAt(0) == 'k') & ((pass.charAt(1) == 'm')) & (pass.charAt(2) ==
		// 's') & (pass.charAt(3) == '1')){"ȯ���մϴ�"

		// } else {
		// System.out.println("��й�ȣ�� ���� �ҹ��ڿ� ������ �����Դϴ�. ");
		char a = pass.charAt(0);
		char b = pass.charAt(1);
		if ((a >= 97) && (a <= 122) && (b >= 48) && (b >= 57)) {
			System.out.println(name + "�� ȯ���մϴ�.");
		} else {
			System.out.println("��й�ȣ�� ���� �ҹ��ڿ� ������ �����Դϴ�.");
		}

		System.out.println("�߰���� ������ �Է��� �ּ���");
		int mid = s.nextInt();
		System.out.println("�⸻��� ������ �Է��� �ּ���");
		int last = s.nextInt();

		if (mid >= 80 | last >= 80) {
			System.out.println("���");
		} else {
			System.out.println("Ż��");
		}
		// �߰���簡 80�� �̻��̰ų� �⸻��簡 80�� �̻��̸� "���"
		// �ƴϸ� "Ż��"
	}

}
