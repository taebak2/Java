package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/temp/test.txt");
		byte[]data = "ABC".getBytes(); // ���ڿ� ABC�� �ϳ��� �߶� �������� 
		for (int i = 0; i < data.length; i++) {
			os.write(data[i]); // "A", "B", "C" �� �ϳ��� ���
		}
		os.flush(); // data �迭�� �����Ͱ��� ��� �����
		os.close();
	}

}
