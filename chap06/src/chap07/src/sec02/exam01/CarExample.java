package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Truck truck = new Truck("���","����",3,"��");
		
		Car car = truck; // �ڵ� Ÿ�� ��ȯ, Car car = new Truck("���","����",3,"��");
		
		car.speedUp(30); // �θ� �޼ҵ� ȣ��
		// car.maxSpeed(50);
		
		truck.speedUp(30);
		// speedup�� Car �޼ҵ�������, truck�� ���� Ÿ�� ��ȯ�� �ؼ� truck������ ��� ���� 
		// Ÿ���� ��ȯ�Ǿ��� ������ �ڽ� �޼ҵ� ȣ�� �Ұ���
		
		car.start();
		//�ڽ� �޼ҵ������� ���ٸ��̵��߱� ������ ȣ�� ����
	}

}
