package sec01;

public class NumberFormatException {

	public static void main(String[] args) {
		String num1 = "100";
		int num2 = Integer.parseInt(num1); // String을 int로 변환
		System.out.println(num2);

		
		String num3 = "가나다";
		int num4 = Integer.parseInt(num3); // 문자를 int로 바꿀 수 없기 때문에 오류 발생
		System.out.println(num4);
		
		

	}

}
