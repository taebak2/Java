package sec04;

public class Car {
	void powerOn() {
		System.out.println("�õ��� �ɷȽ��ϴ�.");

	}

	void powerOff() {
		System.out.println("�õ��� �������ϴ�.");
	}
	private int result =100;

	int speedUp(int x) { // �ӵ�����
		result+=x;
		return result;

	}

	int speedDown(int y) { // �ӵ�����
		result-=y;
		return result;
	}

	int breakZero() { // ���� breakZero�ȿ� �Ű����� ��� �������
		int result = 0;
		return result;
	}

}
