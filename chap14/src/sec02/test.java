package sec02;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class test {

	// ��ĳ�ʸ� �̿�
	// ��ȭ��ȣ�� �Է¹޾� c:/temp/phone.txt ���Ϸ� �����ϼ���
	// ex) 010 8855 8779
	// ����ڰ� �׸��� ������ �Է� ��������
	// bufferedReader �� �̿��� �ܼ�â�� �Էµ� ��ȭ��ȣ ���

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		FileOutputStream os = new FileOutputStream("c:/temp/phone.txt"); // ���Ͽ� ���� FileOutputStream vs OutputStream
		Writer w = new OutputStreamWriter(os);
		while (true) {
			System.out.println("��ȭ��ȣ�� �Է��ϼ���");
			String put = s.nextLine();
			if (put.equals("�׸�"))
				break;
			w.write(put + "\n");
		}
		os.flush(); // ��� ����Ʈ�� ���
		os.close(); // ��� ��Ʈ�� �ݱ�

		Reader reader = new FileReader("c:/temp/phone.txt"); // ��ü reader ���� 
		BufferedReader br = new BufferedReader(reader); // bufferedReader ��ü br ���� : ���� ���� �б�
		while (true) {
			String data = br.readLine(); 
										 // readLine �޼ҵ�� ���� ������ ��ġ���� �� ���� �о� ���ڿ��� ��ȯ
										 // �о�� ���� ���� �ִ� ���� ���� ('\n')�� �������� ����
										 // ������ ���� ������ �� �̻� ���� ������ ���� ���, null�� ��ȯ
			if (data == null)
				break;
			System.out.println(data);
		}
		br.close();
	}

}
