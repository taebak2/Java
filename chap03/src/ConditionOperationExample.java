package sec02;

import java.util.Scanner;

public class ConditionOperationExample {

	public static void main(String[] args) {

		// int score=85;
		// char grade = (score>90)?'A': ((score>80)?'B':'C'); // score�� 90�̻��̸� a 80 �̻��̸�
		// b �׿ܿ��� c
		// System.out.println(score + "���� " + grade + "����Դϴ�.");

		// ����ڰ� ������ �Է��մϴ�.
		// ������ 90�� �̻� "��" 80�� �̻� "��" ������ "��"

		Scanner s = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score = s.nextInt();
		String grade = score >= 90 ? "��" : score >= 80 ? "��" : "��";
		System.out.println(score + "���� " + grade + " ����Դϴ�.");

	}

}
