package sec01.exam02;

public class Car {
	String model; // ��
	String company; // ȸ��
	int cost; // ����
	int fuel; // ����

	public Car(String model, String company) {
		// �Ű����� 2�� ����ϴ� ������
		this.model = model;
		this.company = company;
	}

	void powerOn() {
		System.out.println("�õ��� �մϴ�");
	}

	void powerOf() {
		System.out.println("�õ��� ���ϴ�");
	}
	void speedUp(int speed) {
		System.out.println(speed + "��ŭ �ӵ��� �����մϴ�");
	}
	void speedDown(int speed) {
		System.out.println(speed + "��ŭ �ӵ��� �����մϴ�");
	}

}
