package sec01_1;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		Writer writer = new FileWriter("c:/temp/address2.txt");
		
		System.out.println("�ּҸ� �Է��ϼ���");
		String array = s.nextLine();
		writer.write(array,6,2); // index 6������ 2�� ��� : �ϱ�
		writer.flush();
		writer.close();

	}

}
