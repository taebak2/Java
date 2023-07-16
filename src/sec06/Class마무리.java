package sec06;
public class Class마무리 {
String result;

	String add(int x, int y) {
		int sum = x + y;
		if (sum >= 10) {
			String result = "숫자가 10 이상입니다.";
		}
		return result;
	}

	String adds(int x) {
		String adds = "숫자가 5이상입니다.";
		return adds;
	}

	String b = add(5, 9);
	String c = adds(7);
}
