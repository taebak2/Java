package sec02;

import java.util.Scanner;

public class �迭5 {// ����ڰ� �Է��� ���ڷ� �迭 ���� ����

	// for ���� �̿��� �迭�� ���ڸ� 1���� ����ڰ� �Է��� ���ڸ�ŭ ������ �߰�

	// �Էµ� �������� ��� �� ���

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�迭 ������ �Է��� �ּ���");
		int arraynum = s.nextInt();
		int[] num1 = new int[arraynum]; // �迭 ���� ����
										// �迭 ���� ���� ��� 2int[] num2 = new int[s.nextInt()]; 

		for (int i = 0; i < arraynum; i++) { // i�� 0���� arraynum���� ������ �����ϸ� i�� 1�� ���Ѵ�.
			num1[i] += i + 1; // num1�� 0~arraynum������ ���ڿ� i+1
		}
		int sum = 0;
		double avg = 0;
		for (int j = 0; j < arraynum; j++) {
			sum += num1[j];
			avg = (double) sum / arraynum;
		}
		System.out.println("�������� ��հ��� " + avg + " �Դϴ�.");
	}

}
