package sec01;

import java.io.UnsupportedEncodingException;

public class StringGetByte {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = "�ȳ��ϼ���";
		byte[] byte1 = str.getBytes(); 
		System.out.println(byte1.length); // �ѱ��� 2����Ʈ�� ����.. �׷��� �� 10�� 

		byte[] byte2 = str.getBytes("UTF-8"); 
		System.out.println(byte2.length);

	}

}
