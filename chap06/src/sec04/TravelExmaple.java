package sec04;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class TravelExmaple {

	public static void main(String[] args) {

		Travel tr = new Travel();
		Scanner s = new Scanner(System.in);
		tr.setOil(20);
		tr.setLocation("����");

		while (tr.oilLeft()) {
			System.out.println("�������� �Է��ϼ���");
			String local = s.next(); // oil ���ǹ��� �޴¹� 
			if (local.equals("����")) {
				tr.oilMinus(10);
				tr.setLocation("����");
				System.out.println("�ֹ����� ���Ҿ��. ��� �����ϼ���");
				System.out.println("���� ��ġ�� : " + tr.getLocation());
			}

			else if (local.equals("�λ�")) {
				tr.oilMinus(5);
				tr.setLocation("�λ�");
				System.out.println("���� ��ġ�� : " + tr.getLocation());
			} else {
				tr.oilMinus(2);
				System.out.println("�ֹ����� ���Ҿ��. ��� �����ϼ���");
				System.out.println("���� ��ġ�� : " + tr.getLocation());
			}
		}

	}
}