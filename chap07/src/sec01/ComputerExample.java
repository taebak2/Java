package sec01;


public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;

		Calculator calculator = new Calculator();
		System.out.println("���� ���� : " + calculator.areaCircle(r));
		
		Computer2 computer = new Computer2();
		System.out.println("���� ���� : " + computer.areaCircle(r)); // super.����???
		
	}

}
