package sec01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("c:/temp/test3.db");

		byte[] buffer = new byte[5];

		int readByteNum = is.read(buffer, 2, 3); //  �ε��� 2���� �����Ͽ� �ִ� 3 ����Ʈ�� �о�ͼ� �迭�� �����ϰ�, ������ �о���� ����Ʈ ���� readByteNum ������ ����
		if (readByteNum != -1) { // -1 = ������ ���� �ƴ϶�� �о���� �����͸� ���
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}

}
