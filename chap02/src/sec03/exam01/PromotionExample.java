package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue); // ���� �Ϳ��� ū�ɷ� ����

		char charValue = '��';
		intValue = charValue;
		System.out.println("���� �����ڵ� : " + intValue);

		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
	}
}
