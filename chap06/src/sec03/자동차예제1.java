package sec03;

public class �ڵ�������1 {

	public static void main(String[] args) {
		// Car car = new Car();
		Car car = new Car(); // car.java���� public car(){}��  ���� ��������� ������ ���� ��
		Car car2 = new Car("BMW750i",250,"Volkswagen"); // ������ ������ ��(String model, int speed)�� 3���̹Ƿ� 3���� �Է��ؾ��Ѵ�.
	System.out.println("�𵨸� : " + car2.model);
	System.out.println("�ӵ� : " + car2.speed);
	System.out.println("����ȸ�� : " + car2.company);
	}

}
