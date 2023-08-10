package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample6 {

	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("c:/temp/test3.db");
		byte [] data = {10,20,30,40,50};
		os.write(data);
		
		os.flush();
		os.close();

	}

}
