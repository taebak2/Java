package sec01;

import java.util.Scanner;

public class StringCharAtExample {

	public static void main(String[] args) {

		// 2���� �̸��� ó���ڵ带 �Է� ��������
		// ��) ȫ�浿 C88, �嵿�� B70
		// �� �� ���ڴ� ���, ������ 2���ڴ� �����Դϴ�.
		// ����� A~D��ޱ��� �����ϰ�
		// A����� ������ 20% ����, B����� ������ 10% ����
		// C����� ������ 5% �����Դϴ�.

		// ���������� 90�� �̻��̸� "�ֿ��", 80�̻��̸� "���"
		// �������� "�Ϲ�"�Դϴ�.
		// ���� ��� -> ȫ�浿���� �ֿ�� ����Դϴ�.

		Scanner s = new Scanner(System.in);
		String name[] = new String[2];
		String score[] = new String[2];
		double result;
		
		System.out.println("2���� �̸��� ó���ڵ带 �Է��ϼ���");
		
		
		for (int i = 0; i < 2; i++) {
			result = Integer.parseInt(score[i].substring(1));
			name[i] = s.next();
			score[i] = s.next(); // ���� ���ھ�� ȯ��
			Integer.parseInt(score[i].substring(1));
			switch (score[i].charAt(0)) {
			case 'A':
			case 'a':
				result*=1.2;
				break;
			case 'B':
			case 'b':
				result*=1.1; 
				break;
			case 'C':
			case 'c':
				result*=1.05;
				break;
			}
			System.out.println(name[i] + "���� ");

			System.out.println(result);
			if (result >= 90) {
				System.out.println("�ֿ�� ����Դϴ�.");
			} else if (result >= 80) {
				System.out.println("��� ����Դϴ�.");
			} else {
				System.out.println("�Ϲ� ����Դϴ�.");
			}
		}

	}

}
