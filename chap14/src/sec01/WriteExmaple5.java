package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExmaple5 {

	public static void main(String[] args) throws Exception {
		// ��ĳ�ʸ� ���� ����ڿ��� �ּҸ� �Է¹ޱ�
		// ��) ���� �ϱ�, ���� ����, ���� ����

		Scanner s = new Scanner(System.in);
		OutputStream os = new FileOutputStream("c:/temp/test3.txt");
		System.out.println("�ּҸ� �Է� �ϼ���");
		String address = s.nextLine();
		byte[] data = address.getBytes();

		os.write(data, 5, 4); // �ѱ��� �� ���ڴ� 2����Ʈ...  

		os.flush();
		os.close();
	}

}
