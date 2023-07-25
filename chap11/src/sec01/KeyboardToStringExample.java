package sec01;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException { // 입출력 처리 오류 System.in.read를 사용하기 위해 반드시 입력해줘야한다.
		
		byte[] bytes = new byte[100];
		
		System.out.println("입력하세요 : ");
		int readByteNo = System.in.read(bytes); // Scanner, bufferedReader를 사용하지 않고 입력할 수 있다.
		
		String str = new String(bytes,0,readByteNo-2); //-2 enter랑 줄바꿈 입력도 같이 넘어가서 빼줘야함 
		System.out.println(str);
	}

}
