package sec04;

import java.util.Scanner;

public class PrintExample1 {

	public static void main(String[] args) {
		//���� �̸� ����
		//printf �̿��ؼ� 1 \t �嵿�� �� 26 
		// %d ���� ���� �ڸ��� 3�ڸ� -3d
		
		Scanner s = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = s.next();
		System.out.println("���̸� �Է��ϼ���");
		int age = s.nextInt();
		
		System.out.println("���� \t�̸�\t����\n");
		System.out.printf("%-3d\t%s\t%3d", 1, name, age);
		
		
	}

}
