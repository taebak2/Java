package sec02;

import java.util.Scanner;

public class ���ǹ�3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		System.out.println("����� �ڵ带 �Է����ּ���");
		// A115, B113, C119, a115, b113, c110
		// ����� �ڵ忡�� �� �� ���� �� ���ڸ� �̾ƿ�����.
		//shift tab�� ����
	
		String code = s.next();
		switch (code.charAt(0)) {
		case 'a':
		case 'A':
			System.out.println("�λ�ο� �����Ǽ̽��ϴ�.");
			break;
		case 'b':
		case 'B':
			System.out.println("��ȹ�ο� �����Ǽ̽��ϴ�.");
			break;
		default:
			System.out.println("�ѹ��ο� �����Ǽ̽��ϴ�.");

		}
	}
}
