package sec02;

import java.util.Scanner;

public class �н��ڵ� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String code = s.next(); // �н��ڵ�

		System.out.print("20" + code.substring(0, 2) + "�⵵ "); // �⵵
		
		switch (code.charAt(2)) { // ����
		case 'M':
		case 'm':
			System.out.print("���� ���� ��û���Դϴ�");
			break;
		case 'K':
		case 'k':
			System.out.print("���� ���� ��û���Դϴ�");
			break;
		default:
			System.out.print("���� ���� ��û���Դϴ�");
 
		}
	}

}
