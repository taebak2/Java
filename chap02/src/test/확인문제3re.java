package test;

import java.util.Scanner;

public class Ȯ�ι���3re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù ��° �� :");
		String num1 = s.next();
		System.out.println("�� ��° �� :");
		String num2 = s.next();

		// ù ��° ���� �� ��° ���� ������ �� ���� ���ƿ�
		// �ٸ��� �޶��

		//��� 1
		
		 if(num1.equals(num2)) {
		 System.out.println("�� ���� ���ƿ�");
		 }
		 else {
		 System.out.println("�� ���� �޶��");

		 //��� 2
		 
		// 	if (num1.compareTo(num2) == 0) {
		//	System.out.println("�� ���� ���ƿ�");
		//} else {
		//	System.out.println("�� ���� �޶��");
		}

	}
}
