package sec03.exam07;

public class Ȯ�ι��� {

	public static void main(String[] args) {

		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";

		double var = (byte) intValue;
		byte var2 = (byte) intValue;
		int var3 = (int) doubleValue;
		char var4 = strValue.charAt(0);

		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue2 = 2.5;

		// byte result = byteValue + byteValue; ���� �ϴ� ���� int Ÿ������ ����
		int result = byteValue + byteValue;

		char c1 = 'a';
		int c2 = c1 + 1; // char �����߱� ������ int�� ���� �ް� ��½�, char�� ��ȯ
		System.out.println((char) c2);

		int x = 5;
		int y = 2;
		double results = (double) x / y;
		System.out.println(results); // 2.5 ���

		double var5 = 3.5;
		double var6 = 2.7;
		int resultss = (int) var5 + (int) var6; // 6���� ������ �ϴ¹��?
		System.out.println(resultss);

		
		
	}

}
