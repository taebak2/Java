package sec01;

import java.io.UnsupportedEncodingException;

public class StringGetByte {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = "안녕하세요";
		byte[] byte1 = str.getBytes(); 
		System.out.println(byte1.length); // 한글은 2바이트씩 차지.. 그래서 총 10개 

		byte[] byte2 = str.getBytes("UTF-8"); 
		System.out.println(byte2.length);

	}

}
