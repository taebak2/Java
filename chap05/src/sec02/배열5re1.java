package sec02;

import java.util.Scanner;

public class �迭5re1 {// ����ڰ� �Է��� ���ڷ� �迭 ���� ����
	// for ���� �̿��� �迭�� ���ڸ� 1���� ����ڰ� �Է��� ���ڸ�ŭ ������ �߰�
	// �Էµ� �������� ��� �� ���
	// �迭 ���� ����
	// i�� 0���� arraynum���� ������ �����ϸ� i�� 1�� ���Ѵ�.
	// num1�� 0~arraynum������ ���ڿ� i+1

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		int line[] = new int[num]; // �迭 ���� ����
		int line2[] = new int[num]; // �迭 ���� ����
		
		for (int i = 0; i < num; i++) {

			line[i] += 1 + i; // ������ 0��° ���� 0�� 1+i(0)�� ����
		}
		System.out.println(line);
		System.out.println(line2);
	}

}
