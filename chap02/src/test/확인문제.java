package test;

import java.util.Scanner;

public class Ȯ�ι��� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����� �̸���?");
		String name = s.next();
		System.out.println("����� ���̴�?");
		int age = s.nextInt();
		System.out.println("����� �޴��� ��ȣ ��� 4�ڸ���?");
		String middleNumber = s.next();
		System.out.println("����� �޴��� ��ȣ �� 4�ڸ���?");
		String lastNumber = s.next();
		System.out.println("�̸� " + name );
		System.out.print("����: " + age + "\n"); // �ٹٲ� \n, �� \t % = %% 
		System.out.printf("��ȭ: 010-%s-%s ", middleNumber, lastNumber);

	}

}
