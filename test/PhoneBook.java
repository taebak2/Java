package test;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�ο����� �Է��ϼ���");
		int num = s.nextInt();
		Phone[] p = new Phone[num]; // ��ü ���� ���� �迭�� ���� ���� 
		for (int i = 0; i < num; i++) {
			System.out.println("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ ���� �Է�) : ");
			p[i] = new Phone(s.next(), s.next()); // �̸��� ��ȭ��ȣ �Է� // phone class���� String Ÿ���� ������ ���� �޾ƿ�
		}
		System.out.println("����Ǿ����ϴ�.");

		while (true) {
			System.out.println("�˻��� �̸� : ");
			String name = s.next(); // �̸� �˻�
			if (name.equals("����")) {
				System.out.println("�����մϴ�.");
				break;
			}
			int i = 0;
			for (i = 0; i < num; i++) {
				if (name.equals(p[i].name)) {
					System.out.println(p[i].name + "�� ��ȭ��ȣ�� " + p[i].phNum);
					break;
				}
			}
			if (i == num) { // for�������� i�� num������ ����������, name.equals�� �ȳ��´ٸ� break�� �Ȱɷ��� num�̶� ��������. 
				System.out.println("����� �����ϴ�.");
			}
		}

	}
}