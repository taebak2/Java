package sec02;

import java.util.Scanner;

public class �������迭��������1re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// �ݺ��� �̿��� 3���� �̸��� �Է� ��������
		String name[] = new String[3];
		for (int i = 0; i < name.length; i++) {
			System.out.println((i + 1) + "��° ��� �̸��� �Է��ϼ���");
			name[i] = s.next();
			}

			int[][] num = new int[3][2]; // 3�� 2ĭ ¥�� �迭 ����
			for (int k = 0; k < num.length; k++) {
				int sum = 0; // ����� �ٲ𶧸��� �հ� �ʱ�ȭ
				for (int i = 0; i < num[k].length; i++) {

					if (i == 0) { // ù��° �Է°��̸� �߰����, �ι�°�� �⸻���
						System.out.println(name[i] + "�� �߰������� �Է��ϼ���");
					} else {
						System.out.println(name[i] + "�� �⸻������ �Է��ϼ���");
					}
					num[k][i] = s.nextInt(); // ���� ��ġ�� �� ����
					sum += num[k][i]; // �� ����� �հ谪 ���
				}
				double avg = (double) sum / 2;
				System.out.println(name[k] + "�� ��� ������ " + avg + "�Դϴ�");
			}
		}}
