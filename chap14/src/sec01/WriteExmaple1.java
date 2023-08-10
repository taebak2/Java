package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExmaple1 {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("c:/temp/test1.db");
		
		
		// OutputStream ������ ���� �� 
		// FileNotFoundException�� �߻��ϴ� ���� : ���� ��ΰ� �߸��� ���, ������ ���丮�� �������� �ʴ� ���,
		// ���Ͽ� ���� ������ ���� ���, ������ �ٸ� ���μ����� �����忡 ���� ��� ���� ���, ���� ��ο� Ư�����ڳ� ������ ���Ե� ���
		// ����ó�� �׻� �������(throws Exception or try catch)

		os.close(); // �ݵ�� �ݾ������

		byte a = 10;
		byte b = 20;
		byte c = 30;

		os.write(a);
		os.write(b);
		os.write(c);

		os.flush(); // ��� �����͸� ���
		os.close(); // ��� ��Ʈ�� �ݱ�

	}

}
