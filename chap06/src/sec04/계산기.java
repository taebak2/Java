package sec04;

public class ���� {
	void powerOn() { // �޼ҵ�
		System.out.println("������ �մϴ�.");
	}

	void powerOff() { // �޼ҵ�
		System.out.println("������ ���ϴ�.");
	}

	int plus(int x, int y) { // void�� ������ return���� �ݵ�� �޾������~
		int result = x + y;
		return result;
	}

	int minus(int x, int y) { // �޼ҵ� �ȿ��� if�� ��� ���� 
		int result; // if�� �ȿ��� int result�� ���� �� return���� ���� �� ����.. �׷��� �ʱ⿡ ������ �Ѵ�~
		if (x < y) {
			result = y - x;

		} else {
			result = x - y;
		}

		return result;
	}

	// x�� y�� 0�̸� "0�� �Է��� �� �����ϴ�. ��� ������ ��� �ƴϸ� �������
	// �Ķ���ʹ� Ŭ������ ���� �޶� ������� ex) String mul ( int x, int y)
	String mul(int x, int y) {
		if (x == 0 || y == 0) {
			String message = "0�� �Է��� �� �����ϴ�.";
			return message;
		} else {
			int result = x * y;
			return String.valueOf(result);
		}

	}

	double div(int x, int y) {
		double result = (double)x / y;
		return result;
	}

}
