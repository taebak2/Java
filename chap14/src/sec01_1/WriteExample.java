package sec01_1;

import java.io.Writer;
import java.io.FileWriter;

public class WriteExample {

	public static void main(String[] args) throws Exception{
		
		Writer writer = new FileWriter("c:/temp/test8.txt"); // 문자 기반 출력 스트림
		
		char[] array = {'A','B','C'};
		
		writer.write(array);
		
		writer.flush();
		writer.close();

	}

}
