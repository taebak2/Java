package sec04;

public class SuperCarExample {

	public static void main(String[] args) {
		SuperCar myCar = new SuperCar();
		myCar.keyTurnOn(); // 키를 돌립니다.
		myCar.run(); // 달립니다~
		int speed = myCar.getSpeed(); // getSpeed 메소드값 현재 50(myCar.run에서 최종 값이 50으로 입력됐고 이 값을 getSpeed의 최종값으로 받기) int speed로 호출
		System.out.println("현재 속도 : " + speed + "km/h"); 
	}

}
