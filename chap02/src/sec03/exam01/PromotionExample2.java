package sec03.exam01;

import java.util.Scanner;

public class PromotionExample2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�� ���ڸ� �Է��ϼ��� :");
		String a = s.next();
		
		char b = a.charAt(0); // String Ÿ���� char Ÿ������ ��ȯ,  '0'�� ������ ��ġ ex) ���� �Է½� 1���� �Ѿ�� ������ �� 0=���� 1����, 1=���� 2��°, ....
		int c = b; // char Ÿ���� int�� ��ȯ, toString(������) �����͸� String Ÿ������ ��ȯ  
		
		System.out.println("����ڰ� �Է��� ������ �����ڵ带 ����մϴ�.");
		System.out.println();
		System.out.println("��) " + "�Է��Ͻ� '" + a + "'�� �����ڵ� ���� " + c + "�Դϴ�." );
	}

}
