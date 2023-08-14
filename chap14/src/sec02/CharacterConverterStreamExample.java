package sec02;

import java.io.*;


public class CharacterConverterStreamExample {
	// 문자 변환 스트림을 사용하여 텍스트 파일을 쓰고 읽는 방법

	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다."); // 메소드, 매개변수 문자열 : 해당 문자열을 파일에 작성
	
	String data = read(); // read메소드 리턴타입 스트링
		System.out.println(data);

	}

	public static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("c:/temp/test1.txt");
		Writer writer = new OutputStreamWriter(fos); // new OutPutStreamWriter : 바이트 타입의 스트림을 문자 스트림으로 변환하는 역할

		writer.write(str);
		writer.flush();
		writer.close();
	}

	public static String read() throws Exception { // 메인 구문이 static이라서 static을 꼭 써줘야함
		FileInputStream fis = new FileInputStream("c:/temp/test1.txt");
		Reader reader = new InputStreamReader(fis); // new InputStreamReader : fis를 문자 변환 스트림으로 연결
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, readCharNum); // buffer 배열의 내용을 문자열로 변환하여 반환
		return data;
	}
}
