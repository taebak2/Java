package sec01;

import java.util.Scanner;

public class SwitchDiceExample2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("�����ȣ�� �Է¹޽��ϴ�.");
		String num = s.next();
		switch (num.charAt(6)) {
		case 'A':
			System.out.println("������Ұ� 201ȣ�Դϴ�.");
			break;
		case 'B':
			System.out.println("������Ұ� 202ȣ�Դϴ�.");
			break;
		default:
			System.out.println("������Ұ� 203ȣ�Դϴ�.");
		}
	}

}
