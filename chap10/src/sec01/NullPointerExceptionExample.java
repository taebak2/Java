package sec01;

import java.util.Scanner;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = "�����ͺ��̽�";
		int num = 5;
		System.out.println(data.toString()); // toString : ��ü�� ������ �ִ� ����, ������ String���� ���� String.valueOf�� ����
		System.out.println(data.charAt(1));
		// System.out.println(num.toString()); // num ���� int�� ����(�Ϲ� ����)
		
		//String data1 = null;
		//System.out.println(data1.toString());//(���� ����: NullPointerException = ������ null�̶� �߻��ϴ� ����)
											 // String.valueOf vs toString = Null ���� ���� ����� �ٸ�,
		
		
		
	}

}
