package sec02;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); 
		// car ��ü ����
		
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� �ѱ�Ÿ�̾�� ��ü");
				car.frontLeftTire = new HankookTire(15, "�տ���");
				break;
			case 2:
				System.out.println("�տ����� ��ȣŸ�̾�� ��ü");
				car.frontRightTire = new KumhoTire(13, "�տ�����");
				break;
			case 3:
				System.out.println("�ڿ��� �ѱ�Ÿ�̾�� ��ü");
				car.backLeftTire = new HankookTire(14, "�ڿ���");
				break;
			case 4:
				System.out.println("�ڿ����� ��ȣŸ�̾�� ��ü");
				car.backRightTire = new KumhoTire(17, "�ڿ�����");
				break;
			}
			System.out.println("--------------------------------");
		}
	}

}
