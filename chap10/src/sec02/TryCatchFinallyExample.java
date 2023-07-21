package sec02;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try { // try = 예외 없이 정상 실행되면 catch 블록 코드 실행 X, 예외 발생하면 실행 멈춤
			Class clazz = Class.forName("java.lang.String"); // java.lang.String 찾기
		} catch (ClassNotFoundException e) { // 예외처리 
			System.out.println("클래스가 존재하지 않습니다.");
		} finally {// finally = 무조건 실행
			System.out.println("정상 처리 되었습니다."); 
		}

	}

}
