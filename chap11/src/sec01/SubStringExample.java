package sec01;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "031225-3548812";

		String firstNum = ssn.substring(7, 8);
		// 3�� ���Ե�

		if (firstNum.equals("1") || firstNum.equals("3")) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}

	}

}
