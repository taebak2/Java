package sec01;

public class NumberFormatException {

	public static void main(String[] args) {
		String num1 = "100";
		int num2 = Integer.parseInt(num1); // String�� int�� ��ȯ
		System.out.println(num2);

		
		String num3 = "������";
		int num4 = Integer.parseInt(num3); // ���ڸ� int�� �ٲ� �� ���� ������ ���� �߻�
		System.out.println(num4);
		
		

	}

}
