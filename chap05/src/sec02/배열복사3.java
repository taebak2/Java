package sec02;

import java.util.Scanner;

public class �迭����3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[] person = new String[3];
		for (int i = 0; i < person.length; i++) {
			System.out.println("�л� �̸��� �Է����ּ���.");
			person[i] = s.next();
		}
		String[] person2 = new String[5];
		System.arraycopy(person, 0, person2, 0, person.length);
		for (int i = 0; i < person2.length - 2; i++) {
			System.out.println(person2[i]);
			if (i >= 3) {
				person2[i] = "����";

			}
		}

		// ����ڿ��� 3���� �̸��� �Է¹޾� �迭�� �����ϼ���
		// String Ÿ���� 5��¥�� �迭�� ������ �����ϼ���.
		// ù��° �迭���� �ι�° �迭�� ���� �����ϼ���.

		// �ι�° �迭�� ö��, ����,����,null,null
		// �ι�° �迭�� null ���� ������ ä�켼��

	}

}
