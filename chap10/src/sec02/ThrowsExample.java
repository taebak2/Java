package sec02;

public class ThrowsExample {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않아요.");
		}

	}
	public static void findClass() throws ClassNotFoundException{ // throws가 포함된 클래스는 반드시 try에서 입력해줘야한다.
		Class clazz = Class.forName("java.util.Scanner"); // java.util.Scanner 있나 찾아보세요
	}
}
