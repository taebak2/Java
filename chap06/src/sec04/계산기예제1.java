package sec04;

public class 계산기예제1 {

	public static void main(String[] args) {

		계산기 myCalc = new 계산기();
		myCalc.powerOn(); // 리턴값 없기 때문에(by void) 호출만 해도됩니다~
		
		int result1 = myCalc.plus(5, 3); // 리턴값 있기 때문에 반드시 int값으로 받아들여야한다~
		
		System.out.println(result1);
		
		int result2 = myCalc.minus(3, 5); // 리턴값 있기 때문에 반드시 int값으로 받아들여야한다~
		
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
