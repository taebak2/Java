package sec01;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class test1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		List<Integer> list = new Vector<>();

		while (true) {
			System.out.println("���ڸ� �Է��ϼ���");
			int num = s.nextInt();
			if(num==-1) break; //   
			list.add(num);	   // �Է��� �� ���� �ڵ����� �߰�
		}
		int max = list.get(0); // list.contains : ��ü�� �����ϴ��� ���� Ȯ�� (true or false)
							   // list.get(i) : ��ü �񱳽� get���� ��....?
		for (int i = 1; i < list.size(); i++) {
			if(max<list.get(i)) {
				max=list.get(i);
			}
		}
		System.out.println("���� ū ���� : " + max + " �Դϴ�.");
	}

}
