package sec04;

public class SuperCarExample {

	public static void main(String[] args) {
		SuperCar myCar = new SuperCar();
		myCar.keyTurnOn(); // Ű�� �����ϴ�.
		myCar.run(); // �޸��ϴ�~
		int speed = myCar.getSpeed(); // getSpeed �޼ҵ尪 ���� 50(myCar.run���� ���� ���� 50���� �Էµư� �� ���� getSpeed�� ���������� �ޱ�) int speed�� ȣ��
		System.out.println("���� �ӵ� : " + speed + "km/h"); 
	}

}
