package sec02;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); 
		// car 객체 생성
		
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 한국타이어로 교체");
				car.frontLeftTire = new HankookTire(15, "앞왼쪽");
				break;
			case 2:
				System.out.println("앞오른쪽 금호타이어로 교체");
				car.frontRightTire = new KumhoTire(13, "앞오른쪽");
				break;
			case 3:
				System.out.println("뒤왼쪽 한국타이어로 교체");
				car.backLeftTire = new HankookTire(14, "뒤왼쪽");
				break;
			case 4:
				System.out.println("뒤오른쪽 금호타이어로 교체");
				car.backRightTire = new KumhoTire(17, "뒤오른쪽");
				break;
			}
			System.out.println("--------------------------------");
		}
	}

}
