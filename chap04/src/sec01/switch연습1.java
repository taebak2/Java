package sec01;

import java.util.Scanner;

public class switch����1 {
    
	 //������ ����� ���� ��°� �Է� : switch �ε�ȣ ��� �Ұ�.. 
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("����� �̸���?");
		String name = s.next();

		System.out.println("����� �г���?");
		int grade = s.nextInt();

		switch (grade) {
		case 1:
			System.out.println(name + "���� 1�г��Դϴ�.");
			break;
		case 2:
			System.out.println(name + "���� 2�г��Դϴ�");
			break;
		default:
			System.out.println(name + "���� 3�г��Դϴ�");
			break;
		}

	}

}
