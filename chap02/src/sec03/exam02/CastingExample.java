package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		 int intValue = 200;
		 byte byteValue = (byte) intValue; // ���� Ÿ�� ��ȯ : ū Ÿ���� ���� Ÿ������
		 System.out.println(byteValue);

		//int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		double doubleValue = 3.14;
		//int intValue = (int) doubleValue;
		System.out.println(intValue);
	
	}

}
