package sec02.exam01;

public class Truck extends Car {
	int weight; // ���� �뷮
	String trunkSize; // Ʈ��ũ ������ ��) ��, ��, ��
	int maxSpeed; // �ִ� �ӵ�

	// ������ �Ű����� 4��(�θ�2��, �ڱⲨ 2��)
	public Truck(String color, String company,int weight, String trunkSize) {
		super(color, company);
		this.weight = weight; // this.weight �� weight �� �� int weight; ���� truck(�Ķ���Ͱ�)�� int weight�� ����־��ָ� this.weight = int weight�� Truck(�Ķ����int weight)�� = weight�̴�. 
		this.trunkSize = trunkSize; // �Ķ���Ͱ� + this trunk~ ���ϸ� ������ �ڵ����� �������ֳ�?
	}
	
	// �Ű����� int 1��¥�� ���� �޼ҵ�, ���� Ÿ�� X
	void maxSpeed(int maxSpeed){
		this.maxSpeed += maxSpeed;
	}

	@Override
	void start() {
		System.out.println("Ʈ���� ����߽��ϴ�.");
	}

	@Override
	void stop() {
		System.out.println("Ʈ���� ����ϴ�.");
	}

}
