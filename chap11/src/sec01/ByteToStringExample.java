package sec01;

public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes = { 71, 111, 111, 100, 32, 109, 111, 114, 110, 105, 110, 103 };

		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes, 5, 7); // (bytes, 5, 7) ����Ʈ Ÿ��, 0������.. [5]�������ϰ� 7��
		System.out.println(str2);
	}

}
