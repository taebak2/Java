package sec04;

public class ���⿹��1 {

	public static void main(String[] args) {

		���� myCalc = new ����();
		myCalc.powerOn(); // ���ϰ� ���� ������(by void) ȣ�⸸ �ص��˴ϴ�~
		
		int result1 = myCalc.plus(5, 3); // ���ϰ� �ֱ� ������ �ݵ�� int������ �޾Ƶ鿩���Ѵ�~
		
		System.out.println(result1);
		
		int result2 = myCalc.minus(3, 5); // ���ϰ� �ֱ� ������ �ݵ�� int������ �޾Ƶ鿩���Ѵ�~
		
		System.out.println(result2);
		
		String result3 = myCalc.mul(3, 0);
		
		System.out.println(result3);
		
		Double div = myCalc.div(3, 2);
		System.out.println(div);
		
		byte x = 10;
		byte y = 4;
		double result = myCalc.div(x, y);
		System.out.println(result);
	}

}
