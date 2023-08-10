package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExmaple1 {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("c:/temp/test1.db");
		
		
		// OutputStream 파일을 만들 때 
		// FileNotFoundException이 발생하는 이유 : 파일 경로가 잘못된 경우, 파일이 디렉토리에 존재하지 않는 경우,
		// 파일에 접근 권한이 없는 경우, 파일이 다른 프로세스나 스레드에 의해 사용 중인 경우, 파일 경로에 특수문자나 공백이 포함된 경우
		// 예외처리 항상 해줘야함(throws Exception or try catch)

		os.close(); // 반드시 닫아줘야함

		byte a = 10;
		byte b = 20;
		byte c = 30;

		os.write(a);
		os.write(b);
		os.write(c);

		os.flush(); // 모든 데이터를 출력
		os.close(); // 출력 스트림 닫기

	}

}
