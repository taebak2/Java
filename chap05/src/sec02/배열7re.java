package sec02;

import java.util.Scanner;

public class �迭7re {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("�迭�� ������?");
		int num =  s.nextInt(); // ���� �Է�
		
		int[] scores = new int[num]; // �Է¹��� ���ڷ� �迭 ���� ����
		for (int i = 0; i < scores.length; i++) { // length�� �迭�� ����
			System.out.println((i+1) + "���� ���ڸ� �Է��ϼ���."); // 0�����ʹϱ� +1 
			int num2 = s.nextInt(); // �迭�ѹ��� ���� �Է�
			scores[i] = num2; // �迭�� 0��°�� num2�� ù���� ����, �迭�� 1��°�� num2�� �ι�° ����...
		}
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i]; // ������ scores�迭�� 0������ scores.length��ŭ�� ��
			avg += (scores[i]/num);
		}
		System.out.println("���� : " + sum); 
		System.out.println("��� : " + avg);
	}

}
