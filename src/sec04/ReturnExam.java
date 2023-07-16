package sec04;

public class ReturnExam {

	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	int plus2(int x, int y) {
		byte result = (byte)(x+y);
		return result;
	}
	
	
	
	public static void main(String[] args) {
		ReturnExam reExam= new ReturnExam();
		int result1 = reExam.plus(200, 300);
		System.out.println(result1);
		int result2 = reExam.plus2(200, 300); 
		System.out.println(result2); // 바이트 범위값 초과해서 결과값 이상하게 나온다~

	}

}
