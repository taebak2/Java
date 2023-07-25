package sec01;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		
		byte[] bytes = new byte[100];
		
		System.out.println("입력하세요 : ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes,0,readByteNo-2); //-2 enter랑 줄바꿈 입력도 같이 넘어가서 빼줘야함 
		System.out.println(str);
	}

}
