package sec04;

public class Computer {
	//�Ű� ������ ������ �� �� �迭�� ����Ѵ�.
	// �迭 ��ü ������ �հ� (�迭 ���� �������� �ʾҴ�~) -> ȣ���� �� �迭 ������ �˷�����Ѵ�.
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];

		}
		return sum;
	}

	public static void main(String[] args) {
		Computer myCom = new Computer();
		int[] values1 = { 1, 2, 3 }; // �Ű� ���� �迭 Ÿ������ �����ϴ� ���1
		int result = myCom.sum1(values1);
		System.out.println(result);

		int result2 = myCom.sum1(new int[] { 1, 2, 3 }); // �Ű� ���� �迭 Ÿ������ �����ϴ� ���2
		System.out.println(result2);
	}
}
