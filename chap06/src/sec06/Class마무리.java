package sec06;
public class Class������ {
String result;

	String add(int x, int y) {
		int sum = x + y;
		if (sum >= 10) {
			String result = "���ڰ� 10 �̻��Դϴ�.";
		}
		return result;
	}

	String adds(int x) {
		String adds = "���ڰ� 5�̻��Դϴ�.";
		return adds;
	}

	String b = add(5, 9);
	String c = adds(7);
}
