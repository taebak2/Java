package sec02;

public class ThrowsExample {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʾƿ�.");
		}

	}
	public static void findClass() throws ClassNotFoundException{ // throws�� ���Ե� Ŭ������ �ݵ�� try���� �Է�������Ѵ�.
		Class clazz = Class.forName("java.util.Scanner"); // java.util.Scanner �ֳ� ã�ƺ�����
	}
}
