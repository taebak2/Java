package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/temp/test.txt");
		byte[]data = "ABC".getBytes(); // 문자열 ABC를 하나씩 잘라서 가져오기 
		for (int i = 0; i < data.length; i++) {
			os.write(data[i]); // "A", "B", "C" 를 하나씩 출력
		}
		os.flush(); // data 배열의 데이터값이 모두 비워짐
		os.close();
	}

}
