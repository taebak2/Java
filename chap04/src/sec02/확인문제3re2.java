package sec02;

public class Ȯ�ι���3re2 {

	public static void main(String[] args) {
		// while, break, math.random()
		while (true) {
			int num = (int) (Math.random() * 6 + 1); // �ֻ��� num�� num1�� ������ ������ ����
			int num1 = (int) (Math.random() * 6 + 1);
			System.out.println("�ֻ��� ����1 : " + num);
			System.out.println("�ֻ��� ����2 : " + num1);
			System.out.println();
			if ((num + num1) != 5) {
				continue;
			} else if (num + num1 == 5) {
				break;
			}
		}
	}
}
