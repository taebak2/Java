package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample3 {
	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("c:/temp/name.txt");
		
		Scanner s = new Scanner(System.in);
		String name = s.next();
		byte[] data = name.getBytes();
		
		for (int i = 0; i < data.length; i++) {
			os.write(data[i]);
		}
		os.flush(); // ��� ����Ʈ�� ���
		os.close(); // ��� ��Ʈ�� �ݱ� 
	}
}
