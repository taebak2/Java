package sec01;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputExample {

	public static void main(String[] args) throws Exception{
		
		InputStream is = new FileInputStream("c:/temp/test1.db"); // "c:/temp/test1.db" ��ο� �ִ� ������ ����.
		
		while(true) {
			int data = is.read(); 	// ���Ͽ��� ����Ʈ �ϳ��� �о���̰� �� ���� data ������ �����մϴ�. 
			if(data==-1) break;		// read() �޼���� ������ ���� �����ϸ� -1�� ��ȯ�մϴ�.
			System.out.println(data);
		}
		is.close(); // ��� ��Ʈ�� �ݱ� 

	}

}
