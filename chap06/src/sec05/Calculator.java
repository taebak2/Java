package sec05;

public class Calculator {
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		
		return x + y;  
	}
	static int minus(int x, int y) {
		
		return x-y;
	}
	
	public static void main(String[]args) {
		double result1 = 10 * 10 *Calculator.pi; // ���� ���̰� ���ٴ�?
		System.out.println(result1);
	}
}
