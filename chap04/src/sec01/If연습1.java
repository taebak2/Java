package sec01;

import java.util.Scanner;

public class If����1 {
//if �߰�ȣ ���� ���� but ù�ٸ� �ش�.. �� �ؿ� ���� ������ ����
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("����� �̸���?");
		String name = s.next();

		System.out.println("����� ������?");
		int score = s.nextInt();

		if (score >= 70) {
			System.out.println(name + "���� �հ��Դϴ�.");

		} else {
			System.out.println(name + "���� ���հ��Դϴ�.");
		}

	}

}
