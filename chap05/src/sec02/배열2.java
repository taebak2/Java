package sec02;

public class �迭2 {

	public static void main(String[] args) {
		/*
		 * int[] a; // �迭 ����1 int b[]; // �迭 ����2 String c[];
		 */
		// �迭 ����

		int d[] = { 52, 87, 94, 77, 69 }; // �迭 ���� �� ����
		double sum = 0;
		// �迭�� ��ü �հ�� ����� ���ϼ���
		// ����� double Ÿ������
		// for
		for (int i = 0; i < 5; i++) {
			sum += d[i];
		}
		System.out.println("����� " + (double) (sum / 5) + " �Դϴ�");

		int[] t;
		// {1,2,3}; // ������ ���� �߻�

		int[] s = null;
		s = new int[] { 1, 2, 3 }; // �迭[]�� ����Ÿ���̱� ������ new �Է��������
		int[] k = new int[] { 1, 2, 3 };
		int[] q = { 1, 2, 3 };

	}

}
