package sec04;

import java.util.Scanner;

public class ��������2 {

	public static void main(String[] args) {
		// ����� ��й�ȣ�� �Է��ϼ���
		// ��й�ȣ : 1234
		// ���� ��й�ȣ�� �߸� �Է������� => ��й�ȣ�� Ʋ���ϴ�.
		// ����� = ȯ���մϴ�.

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("����� ��й�ȣ�� �Է��ϼ���");
			String password = s.nextLine(); //nextline�� next�� �޸� ���� �ν� ���� 
			if (password.equals("1234")) {
				System.out.println("ȯ���մϴ�.");
				break;
			}

			System.out.println("��й�ȣ�� Ʋ���ϴ�.");

		}
	}
}
