package sec02;

import java.util.Scanner;

public class �������迭��������1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// �ݺ��� �̿��� 3���� �̸��� �Է� ��������
		String name[] = new String[3];
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("�̸��� �Է��ϼ���");
			name[i] = s.next();
		}

		int[][] num = new int[3][2]; // 3�� 2ĭ ¥�� �迭 ����
		for (int k = 0; k < num.length; k++) {
			System.out.println("�߰���� ������ �Է��ϼ���");
			int midScore = s.nextInt();
			System.out.println("�⸻��� ������ �Է��ϼ���");
			int lastScore = s.nextInt();
			


		}
		System.out.println(name[0] + "�� ��� ������ " + (sum1 / 2) + "�Դϴ�.");
		System.out.println(name[1] + "�� ��� ������ " + (sum2 / 2) + "�Դϴ�.");
		System.out.println(name[2] + "�� ��� ������ " + (sum3 / 2) + "�Դϴ�.");
	}
}