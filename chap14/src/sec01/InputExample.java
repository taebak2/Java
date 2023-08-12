package sec01;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputExample {

	public static void main(String[] args) throws Exception{
		
		InputStream is = new FileInputStream("c:/temp/test1.db"); // "c:/temp/test1.db" 경로에 있는 파일을 연다.
		
		while(true) {
			int data = is.read(); 	// 파일에서 바이트 하나를 읽어들이고 그 값을 data 변수에 저장합니다. 
			if(data==-1) break;	// read() 메서드는 파일의 끝에 도달하면 -1을 반환합니다.
			System.out.println(data);
		}
		is.close(); // 출력 스트림 닫기 

	}

}
