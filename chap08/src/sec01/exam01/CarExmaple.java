package sec01.exam01;

public class CarExmaple {

	public static void main(String[] args) {
		Car car = new Truck();
		
		car.speedUp(30); // Truck�� ���ǵ忡 ����
		car.speedUp(300); 
		
		//���� Car�� ������ SportCar Ŭ������ �ִٸ�
		// car = new SportCar(); �� �̿��Ͽ�
		// car �������̽� �ϳ��� �� ��ü�� ���� ���� ������ 
		
		car = new SportCar(); // ������ī�� ���� 
		
		car.speedUp(50);
		car.speedDown(20);
	}

}
