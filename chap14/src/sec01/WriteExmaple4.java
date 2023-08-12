package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExmaple4 {

	public static void main(String[] args) throws Exception{
		/*
		  OutputStream os = new FileOutputStream("c:/temp/test2.db");
		  byte[] array = {10,20,30};
		  os.write(array); os.flush(); os.close();
		 */
		
		
		OutputStream os = new FileOutputStream("c:/temp/test2.txt");
		byte[]	data = "ABC".getBytes();
		os.write(data);
		os.flush();
		os.close();
		
		// ABC 출력
		
	}

}
