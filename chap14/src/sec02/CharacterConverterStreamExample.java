package sec02;

import java.io.*;


public class CharacterConverterStreamExample {
	// ���� ��ȯ ��Ʈ���� ����Ͽ� �ؽ�Ʈ ������ ���� �д� ���

	public static void main(String[] args) throws Exception {
		write("���� ��ȯ ��Ʈ���� ����մϴ�."); // �޼ҵ�, �Ű����� ���ڿ� : �ش� ���ڿ��� ���Ͽ� �ۼ�
		String data = read(); // read�޼ҵ� ����Ÿ�� ��Ʈ��
		System.out.println(data);

	}

	public static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("c:/temp/test1.txt");
		Writer writer = new OutputStreamWriter(fos); // new OutPutStreamWriter : ����Ʈ Ÿ���� ��Ʈ���� ���� ��Ʈ������ ��ȯ�ϴ� ����
		writer.write(str);
		writer.flush();
		writer.close();
	}

	public static String read() throws Exception { // ���� ������ static�̶� static�� �� �������
		FileInputStream fis = new FileInputStream("c:/temp/test1.txt");
		Reader reader = new InputStreamReader(fis); // new InputStreamReader : fis�� ���� ��ȯ ��Ʈ������ ����
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, readCharNum); // buffer �迭�� ������ ���ڿ��� ��ȯ�Ͽ� ��ȯ
		return data;
	}
}
