package sec04;

public class GasCar { // 필드

	int gas; // 생성자

	void setGas(int gas) { // 메소드
		this.gas = gas;
		System.out.println("가스가 5만큼 충전되었습니다.");
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("가스가 없습니다.");
			return false;
		}
		System.out.println("가스가 있습니다.");
		return true; // boolean gasState가 true (GasCarExample 10번 코드)
	}

	void run() { // void는 return값 필요없지만, 만약 return값을 쓴다면 중지한다.
		while (true) {
			if (gas > 0) {
				System.out.println("가스잔량 : " + gas);
				gas -= 1;
			} else {
				System.out.println("가스잔량 : " + gas);
				return;
			}
		}
	}

}
