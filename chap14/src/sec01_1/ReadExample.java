package sec01_1;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception{

		Reader reader = new FileReader("c:/temp/test2.txt");
		while(true) {
			int data = reader.read();
			if(data==-1) break;
			System.out.println((char)data);
		}
		reader.close();
	}

}
