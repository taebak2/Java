package sec01;

import java.util.ArrayList;
import java.util.List;

public class GesipanExample {

	public static void main(String[] args) {

		List<Gesipan> list = new ArrayList<>(); // Gesipan Ŭ���� ��ü�� ����Ʈ�� ��

		list.add(new Gesipan(1, "8���ʼ�������", "�ڹٰ���������Ʈ��ǥ", "ȫ�浿"));
		list.add(new Gesipan(2, "9���ʼ�������", "�����ͺ��̽�", "ȫ�浿"));
		list.add(new Gesipan(3, "10���ʼ�������", "JSP", "ȫ�浿"));
		list.add(new Gesipan(4, "11���ʼ�������", "��������Ʈ�غ�", "ȫ�浿"));

		for (int i = 0; i < list.size(); i++) {
			Gesipan gesi = list.get(i);
			
			System.out.println(list.get(i));
			System.out.println(gesi.number + " " + gesi.subject + " " + gesi.content + gesi.user);
		}
	}

}
