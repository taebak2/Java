package sec02;

import java.util.Scanner;

public class Ȯ�ι���6 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner s = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("----------------------------------------------------");
			System.out.print("����> ");

			s.nextLine();
			int selectNo = Integer.parseInt(s.nextLine()); //

			if (selectNo == 1) {
				System.out.print("�л� ��>");
				studentNum = s.nextInt();
			} else if (selectNo == 2) {
				System.out.println("������ �Է��ϼ���");
				scores = new int[studentNum];
				for (int i = 0; i < studentNum; i++) {
					scores[i] = s.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println(scores[i]);
				}

			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0; // �հ� ���Ҷ��� ������ 0; ����......
				for (int i = 0; i < studentNum; i++) {
					if (scores[i] > max) {
						max = scores[i];
					}
					sum += scores[i];
				}
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ���� " + (sum / studentNum));

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}
