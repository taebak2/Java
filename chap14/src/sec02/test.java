package sec02;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class test {

	// 스캐너를 이용
	// 전화번호를 입력받아 c:/temp/phone.txt 파일로 저장하세요
	// ex) 010 8855 8779
	// 사용자가 그만할 때까지 입력 받으세요
	// bufferedReader 를 이용해 콘솔창에 입력된 전화번호 출력

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		FileOutputStream os = new FileOutputStream("c:/temp/phone.txt"); // 파일에 저장 FileOutputStream vs OutputStream
		Writer w = new OutputStreamWriter(os);
		while (true) {
			System.out.println("전화번호를 입력하세요");
			String put = s.nextLine();
			if (put.equals("그만"))
				break;
			w.write(put + "\n");
		}
		os.flush(); // 모든 바이트를 출력
		os.close(); // 출력 스트림 닫기

		Reader reader = new FileReader("c:/temp/phone.txt"); // 객체 reader 생성 
		BufferedReader br = new BufferedReader(reader); // bufferedReader 객체 br 생성 : 파일 내용 읽기
		while (true) {
			String data = br.readLine(); 
										 // readLine 메소드는 현재 파일의 위치에서 한 줄을 읽어 문자열로 반환
										 // 읽어온 줄의 끝에 있는 개행 문자 ('\n')는 포함하지 않음
										 // 파일의 끝에 도달해 더 이상 읽을 내용이 없을 경우, null을 반환
			if (data == null)
				break;
			System.out.println(data);
		}
		br.close();
	}

}
