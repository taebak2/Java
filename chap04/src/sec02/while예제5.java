package sec02;

import java.util.Scanner;

public class while����5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �ϳ��� �Է��ϼ���(1~10)");

		int userNum = s.nextInt();
		int num = (int) (Math.random() * 10) + 1; // �������� ���� ���� (1~10)

		// ���� ���� �ۼ��ϼ���
		if (userNum == num) {
			System.out.println("��ǻ�� ���� : " + num);
			System.out.println("����� ���� : " + userNum);
			System.out.println("�����Դϴ�.");
		}

		else {
			System.out.println("��ǻ�� ���� : " + num);
			System.out.println("����� ���� : " + userNum);
			System.out.println("�����Դϴ�.");
		}
	}

}
