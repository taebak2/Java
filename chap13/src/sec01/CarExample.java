package sec01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {

		List<Car> list = new ArrayList<>();

		Scanner s = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("�۾� ������ �Է����ּ���");
			System.out.println("�߰��� 1��, ������ 2��, ����� 3��, ����� 4��");
			int num = 0;
			try {
				num = s.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				return;
			}

			switch (num) {
			case 1:
				System.out.println("���� ����ȸ���?");
				String company = s.next();
				System.out.println("���� ������?");
				int cost = s.nextInt();

				System.out.println("���� �ְ� �ӵ���?");
				int speed = s.nextInt();
				System.out.println("���� ������?");
				String color = s.next();

				list.add(new Car(company, cost, speed, color));
				break;
			case 2:
				System.out.println("������ �������� �ε��� ��ȣ�� �Է��ϼ���");
				int del = s.nextInt();
				list.remove(del);
				break;

			case 3:
				for (int i = 0; i < list.size(); i++) {
					Car car2 = list.get(i);
					System.out.println(car2.company + " " + car2.cost + " " + car2.maxSpeed + " " + car2.color);
				}
				break;
			case 4:
				System.out.println("�����մϴ�.");
				run = false;
				break;
			}
		}

		// 1 ������ �߰�
		// ����ڷκ��� ������ �Է� �޾� �ڵ��� Ŭ���� ��ü�� �����Ͽ�
		// ����Ʈ�� �߰��ϼ���

		// 2 ������ ����
		// ����ڷκ��� �� ��ȣ�� �Է¹޾� (index) ����Ʈ �����͸� �����ϼ���

		// 3 ������ ���
		// �Էµ� ����Ʈ �����͸� ��� ����ϼ���

		// ���� ó��

	}

}
