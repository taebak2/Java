package sec03.exam01;

import java.util.Scanner;

public class PromotionExample3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����б��� �Է��ϼ���");
		String a = s.next();
		System.out.println("���� ���г� �ΰ���?");
		int c = s.nextInt();
;		char b = a.charAt(2); // 3��° ���ڸ� charŸ������ ���� 

		if (b == '��') {
			System.out.println("����� ���б� " + c + "�г��Դϴ�.");
		} else {
			System.out.println("����� ����б� "+ c + "�г��Դϴ�.");
		}

	}

}
