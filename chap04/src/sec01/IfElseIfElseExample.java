package sec01;

import java.util.Scanner;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�߰���� ������?");
		int mid = s.nextInt();
		System.out.println("�⸻��� ������?");
		int last = s.nextInt();

		double result = (mid + last) / 2;

		if (mid < 60 || last < 60) {
			System.out.println("�����");
		}

		else if (result >= 90) {
			System.out.println("A����");
		} else if (result >= 80) {
			System.out.println("B����");

		} else if (result < 80) {
			System.out.println("C����");
		}
	}
}
