package sec02;

import java.util.Scanner;

public class teamStudy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�л���?");
		int count = s.nextInt();
		System.out.println("�� �ٿ� ��� �ɳ���?");
		int line = s.nextInt();

		// ��� 1
		if (count % line == 0) {
			System.out.println("�� " + (count / line) + "���̰� " + "���� �¼� ���� " + (line - (count % line)) + "�� �Դϴ�");
		} else {
			System.out.println("�� " + ((count / line) + 1) + "���̰� " + "���� �¼� ���� " + (line - (count % line)) + "�� �Դϴ�");
		}

	}

}
