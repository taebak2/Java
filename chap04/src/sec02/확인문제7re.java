package sec02;

import java.util.Scanner;

public class Ȯ�ι���7re {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("�������࿡ �湮�Ͻ� ���� ȯ���մϴ�.");
		

		// �ܰ� balance, ���� deposit, ��� withdraw
		int balance = 500000000; // ���� �ܰ� 0���� ���� �����ܰ� ��ݱݾ׺��� ũ�ų� ���ƾ���.
		int deposit, withdraw, choice;
		boolean run = true;

		while (run) {
			System.out.println("������ 1��, ����� 2��, �ܰ�Ȯ���� 3��, ����� 4���Դϴ�.");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("�Ա� �ݾ��� ���Դϱ�?");
				deposit = s.nextInt();
				balance += deposit;
				System.out.println("���� �ܰ� �ݾ��� " + balance + "�� �Դϴ�.");
				break;
			case 2:
				System.out.println("��� �ݾ��� ���Դϱ�?");
				withdraw = s.nextInt();
				if (withdraw > balance) {
					System.out.println("���� �ܾ��� �����մϴ�.");
				} else {
					balance -= withdraw;
					System.out.println("���� �ܾ��� " + balance + "�� �Դϴ�.");
					break;
				}
			case 3:
				System.out.println("�ܰ� �ݾ��� " + balance + "�� �Դϴ�.");
				break;
			default:
				System.out.println("����");
				run = false;
				System.out.println("�ȳ��� ���ʽÿ�.");
			}
		}

	}
}
