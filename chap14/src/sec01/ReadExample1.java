package sec01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("c:/temp/test3.db");

		byte[] buffer = new byte[5];

		int readByteNum = is.read(buffer, 2, 3); //  인덱스 2부터 시작하여 최대 3 바이트를 읽어와서 배열에 저장하고, 실제로 읽어들인 바이트 수를 readByteNum 변수에 저장
		if (readByteNum != -1) { 		 // -1 = 파일의 끝이 아니라면 읽어들인 데이터를 출력
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}

}
