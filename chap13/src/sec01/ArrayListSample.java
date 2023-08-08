package sec01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		// 2��° �濡 Database �߰��ϸ� ���� �ִ� Servlet�� �з��� 3���� ��
		list.add("iBATIS");

		int size = list.size(); 
		System.out.println("�� ��ü �� : " + size);

		String skill = list.get(2); // 2������ ������ Ÿ���� String�̱� ������ String �������
		System.out.println("2 : " + skill);

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str); // list�� �ִ� ������ ���
		}
		
		list.remove(2); // 2��° �� ������ ����(Database)
		list.remove(2); // 2��° �� ������ ����(3������ Servlet�� 2������ �������� Database�� ������ ���� �����)
		list.remove("iBATIS"); // �������� ���� ����
	}
	
}
