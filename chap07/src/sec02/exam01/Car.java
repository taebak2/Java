package sec02.exam01;

public class Car {
	String color; // �ڵ��� ����
	String company; // ���� ȸ��
	int speed; // �ӵ�
	int cost; // ����
	
	
	//�Ű����� 2���� ������, �⺻ ������ X
	public Car(String color, String company) {
		this.color = color;
		this.company = company;
	}

	
	// �Ű����� 1��¥�� �޼ҵ�, ���� Ÿ�� X
	void speedUp(int speed) {
		this.speed += speed; 		// ex) void speedUp(int x) {speed += x;}
	}
	
	// �Ű����� 1��¥�� �޼ҵ�, ���� Ÿ�� X
	void speedDown(int speed) {
		this.speed -= speed;
	}
	
	// �Ű����� X, ���� Ÿ�� X
	void start() {
		System.out.println("�õ��� �ɾ����ϴ�.");
	}
	
	// �Ű����� X, ���� Ÿ�� X
	void stop() {
		System.out.println("���� ����ϴ�.");
	}
	
}
