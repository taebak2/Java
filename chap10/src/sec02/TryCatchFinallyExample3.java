package sec02;

public class TryCatchFinallyExample3 {

	public static void main(String[] args) {

		try {
			//String data1 = args[0]; case 1: ArrayIndexOutOfBoundsException(실행 매개변수 부족할 때 발생하는 오류)
			//String data2 = args[1];
			
			//String data1 = "가나"; // case 2: NumberFormatException(숫자 형식 오류)
			//String data2 = "다라";
			
			String data1 = "123"; // case 3: try 조건 실행 
			String data2 = "456";
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("두 수의 합은 : " + result);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개변수가 부족합니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
