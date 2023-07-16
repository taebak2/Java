package sec05;

public class Calculator {
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		
		return x + y;  // return plus가 아닌 return x+y;도 가능, 변수값 설정하는것도 가능 ex) int result = x+y;
		
	}
	static int minus(int x, int y) {
		
		return x-y;
	}
	
	public static void main(String[]args) {
		double result1 = 10 * 10 *Calculator.pi; // class에 있는 Calculator는 원래 바로 불러올 수가 없다. 하지만 static이라는 정적 변수를 이용해서 바로 불러왔다. 
							// ex) 원래는 new를 이용해서 새로 입력 해주고 불러야한다...
		System.out.println(result1);
	}
}
