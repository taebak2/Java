package sec01;

import java.util.Scanner;

public class SubStringExmaple1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����� �̸����� �Է����ּ���");
		String email = s.next();
		int id = email.indexOf("@"); // @��ġ ã�Ƴ���
		System.out.println(email.substring(0,id)); // @������ ����
		System.out.println(email.substring(id+1));
		
		// ��) 12dk545@hanmail.net -> ���̵� ����

	}

}
