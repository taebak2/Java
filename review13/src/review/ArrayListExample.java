package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("�ڹ�");
		list.add("jsp");
		list.add("html");
		
		int size = list.size();
		System.out.println(size);
		
		String str2="";	// ���ڿ� �ʱ�ȭ
		for(String str : list) {	// list�� ��ȸ�Ϸ��� ���ڿ� ���, 
			str2 += str + " ";		// str2�� �� ��Ұ� ���յǴ� ���ڿ�
		}
		System.out.println(str2);
		
		Vector<Integer> v = new Vector<>();
		v.add(5);
		v.add(7);
		v.add(-3);
		
		v.add(2,40);	// 2��° �濡 ���� -3�� 3��° ������ �и���.
		int size2 = v.size();
		System.out.println(size2);
		
		// ��� ���� ��� 
		// ��� ���� �հ� ���
		
		for (int i = 0; i < size2; i++) {
			System.out.println(v.get(i));
		}
		
		int integer1 = 0;
		for (Integer integer : v) {	// �ݺ� ������ ��ü�� ��ȸ�ϸ鼭 �� ��ҿ� �����ϴ� Java�� �ݺ���
			integer1 +=integer;
		}
		System.out.println(integer1);
		
		int sum=0;
		for(int i=0; i<v.size(); i++) {
			int a = v.get(i);
			sum+=a;
		}
		System.out.println(sum);
	}
	
	

}
