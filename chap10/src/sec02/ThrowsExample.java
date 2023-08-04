package sec02;

public class ThrowsExample {

	public static void main(String[] args) {
		
		try {				// try = if, catch = else if 개념이라고 생각하면 쉬움 예외처리를 하기위해선 try catch 구문이 반드시 필요
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않아요.");
		}

	}
	public static void findClass() throws ClassNotFoundException{ // throws가 포함된 클래스는 반드시 try에서 입력해줘야함
		Class clazz = Class.forName("java.util.Scanner"); // java.util.Scanner 찾기 
	}
}
