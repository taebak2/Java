package sec03;

import java.util.Scanner;

public class ����Ǯ�̿���1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("�����ձ� ������ �����մϴ�...");
		System.out.println("���ӿ� �����ϴ� �ο��� ����Դϱ�?");

		int num = s.nextInt(); // String�� int�� �ѱ�// �����ο��� ����
		String[] name = new String[num]; // �迭��ŭ ��� ����
		String[] vs = new String[2]; // string �迭�� 2�� ����
		System.out.println("������ �̸��� �Է��ϼ���");
		for (int i = 0; i < name.length; i++) {
			name[i] = s.next(); // �ο�����ŭ �̸� �Է�
		}
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�");
		vs[0] = "�ƹ���";
		Name: while (true) {
			for (int i = 0; i < name.length; i++) {
				System.out.println(name[i] + ">>"); // ���±�>>
				vs[1] = s.next(); // vs0������ �����ձ� �Է�
				if (vs[1].equals("�׸�")) {
					System.out.println("�����մϴ�.");
					break;
				}

				if (vs[0].charAt(vs[0].length() - 1) != vs[1].charAt(0)) { // vs 0���� ù���ڰ� vs1�� ������ ���ڶ� ���ٸ�
					System.out.println(name[i] + "���� �����ϴ�.");
					System.out.println("�����մϴ�.");
					break Name; // break �̸� ���� while�� ����
				}
				vs[0] = vs[1];

			}

		}

	}
}
