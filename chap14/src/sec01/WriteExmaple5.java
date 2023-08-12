package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExmaple5 {

	public static void main(String[] args) throws Exception {
		// 스캐너를 통해 사용자에게 주소를 입력받기
		// 예) 광주 북구, 광주 서구, 광주 동구

		Scanner s = new Scanner(System.in);
		OutputStream os = new FileOutputStream("c:/temp/test3.txt");
		System.out.println("주소를 입력 하세요");
		String address = s.nextLine();
		byte[] data = address.getBytes();

		os.write(data, 5, 4); // 한글은 한 글자당 2바이트

		os.flush();
		os.close();
	}

}
