package sec03.exam07;

public class Ȯ�ι���2 {

	public static void main(String[] args) {

		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";

		int result = (int) (var1) + (int) (var2) + (int) (var3) + (int) Double.parseDouble(var4); // 8����
		System.out.println(result);

		int result2 = (int) (var1 + var2 + var3) + (int) Double.parseDouble(var4); // 9����

		int result3 = (int) (var1 + var2 + var3 + Double.parseDouble(var4)); // 10����
		System.out.println(result3);
	}

}
