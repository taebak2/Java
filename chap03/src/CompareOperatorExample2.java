package sec02;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		System.out.println(v2);

		double v4 = 0.1; // 왜 false 나오는지 확인..
		float v5 = 0.1f;
		System.out.println(v4 == v5);

	}

}
