package sec04;

public class GasCarExample {

	public static void main(String[] args) {
		GasCar myCar = new GasCar();
		myCar.setGas(5);

		boolean gasState = myCar.isLeftGas(); // isLeftGas = gasCar의 리턴값 true or false 로 바뀜
		// myCar.isLeftGas == true,false 같은 말
		if (gasState) { // if gasState = true or false 라면~
			System.out.println("출발합니다.");
			myCar.run();
		}

		if (myCar.isLeftGas()) { // if안에 조건이 true면 필요 없습니다 출력
			System.out.println("가스를 주입할 필요가 없습니다.");
		} else { // if안에 조건이 false라서 가스를 주입하세요가 출력
			System.out.println("가스를 주입하세요.");
		}
	}

}
