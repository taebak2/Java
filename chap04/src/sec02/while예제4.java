package sec02;

import java.util.Scanner;

public class while����4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = (int) (Math.random() * 20) + 1; // �������� ���� ���� (1~10)

		// ���� ���� �ۼ��ϼ���

		while (true) {
			System.out.println("���ڸ� �ϳ� �Է��ϼ���(1~20)");
			int userNum = s.nextInt();
			if (userNum == num) {
				System.out.println("�����Դϴ�.");
				break;
			} else if (userNum > num) {
				System.out.println("�Է� ���� �� Ŀ��. ���� ���� �Է��ϼ���");
			} else {
				System.out.println("�Է� ���� �� �۾ƿ�. ū ���� �Է��ϼ���");
			}

		}
	}
}
