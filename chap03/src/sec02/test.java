package sec02;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		System.out.println("���� ��ȣ�� �Է��� �ּ���(+,)");
		String a = s.next();
		
		if(a.equals("+")) {
			System.out.println(++x);
		}
		else {
			System.out.println(--y);
		}
		
		
	}

}
