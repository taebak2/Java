package sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("�ڹ�");
		set.add("���̵��");
		set.add("����");
		set.add("�ڹ�");
		set.add("���̹�Ƽ��");
		set.add("���̵��"); // Java�� �� ���� �����

		int size = set.size();
		System.out.println("�� ��ü��: " + size);

		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) { // hasNext�� booleanŸ�� true or false�� ��ȯ
			String element = iter.next();
			System.out.println(element);
		}
		
		iter = set.iterator();
		for (String element : set) { // set�� ��ü�� element�� �ֱ�
			System.out.println(element);
		}
		set.clear();
		if(set.isEmpty()) {
			System.out.println("�������");
		}
	}

}
