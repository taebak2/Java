package sec01;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		
		byte[] bytes = new byte[100];
		
		System.out.println("�Է��ϼ��� : ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes,0,readByteNo-2); //-2 enter�� �ٹٲ� �Էµ� ���� �Ѿ�� ������� 
		System.out.println(str);
	}

}
