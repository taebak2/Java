package sec01;

import java.util.Scanner;

public class ����켱���� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("���� �ϳ��� �Է��ϼ���");
		int num1 = s.nextInt();

		System.out.println("������ (+,-)�� �Է��ϼ���");
		String oper = s.next();

		// ���� �����ڰ� +�� �Է��� ���ڿ��� 1�� �������� ����ϰ�
		// �����ڰ� -�� �Է��� ���ڿ��� 1�� ���ҽ��� ����ϼ���

		if (oper.equals("+")) {
			System.out.println(++num1);
		} else {
			System.out.println(--num1);
		}
	}

}
