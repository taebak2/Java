package sec02;

import java.util.Scanner;

public class �迭6re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[] weather = new String[4]; // 4������ �� ����
		weather[0] = "��";
		weather[1] = "����";
		weather[2] = "����";
		weather[3] = "�ܿ�";
		boolean repeat = true;

		// �� 1�� ���� 2��...
		while (repeat) {
			System.out.println("�����ϴ� ������ �Է��ϼ���");
			System.out.println("���� 1, ������ 2, ������ 3, �ܿ��� 4");
			int choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.println(weather[0]);
				repeat = false;
				break;
			case 2:
				System.out.println(weather[1]);
				repeat = false;
				break;
			case 3:
				System.out.println(weather[2]);
				repeat = false;
				break;
			case 4:
				System.out.println(weather[3]);
				repeat = false;
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println("�����ϴ� ������ �Է��ϼ���");
				System.out.println("���� 1, ������ 2, ������ 3, �ܿ��� 4");
				choice = s.nextInt();
			}

		}

	}
}
