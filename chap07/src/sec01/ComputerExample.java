package sec01;


public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;

		Calculator calculator = new Calculator();
		System.out.println("원의 면적 : " + calculator.areaCircle(r));
		
		Computer2 computer = new Computer2();
		System.out.println("원의 면적 : " + computer.areaCircle(r)); // super.사용법???
		
	}

}
