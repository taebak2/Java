package sec03.exam07;

import java.util.Scanner;

public class ���ڸ��⺻Ÿ�����κ�ȯ {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��ϼ���");
		String a = s.next();
		System.out.println("�ι�° ���� �Է��ϼ���");
		String b = s.next();

		int value = Integer.parseInt(a); // Integer.parseInt(); = ���ڿ��� int������
		int values = Integer.parseInt(b);

		int c = value + values;

		System.out.println("�� ������ �հ�� " + c + " �Դϴ�.");

		// String.valueOf(Ÿ�԰�) = Ÿ�԰� -> ���ڷ� ��ȯ
	}

}
