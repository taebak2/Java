package sec01;

import java.util.*;

public class �ؽøʿ���1 {

	public static void main(String[] args) {
		// ����� �α����� ��ĳ�ʸ� �̿��� 3���� �Է� ��������
		// �� ) �ѱ� 5000, �Ϻ� 12000, �߱� 30000
		// �ش� �����͸� �ؽø����� ������ ��
		// ����ڰ� ���� �̸��� �Է��ϸ� �α����� ����ϴ� �ڵ带 �ۼ��ϼ���
		// ����ڰ� �׸��̶�� �Է��ϸ� �����ϼ���

		Map<String, Integer> population = new HashMap<>();
		Scanner s = new Scanner(System.in);

		System.out.println("����� �α����� �Է��� �ּ���");

		for (int i = 0; i < 3; i++) {
			population.put(s.next(), s.nextInt()); // ���� ���� ���ص� ������..
		}
		while (true) {
			System.out.println("���� �̸��� �Է����ּ��� : ");
			String search = s.next();
			if(search.equals("�׸�")) {
				System.out.println("�˻��� �����մϴ�.");
				break;
			}
			if (population.containsKey(search)) {
				System.out.println("�ش� ������ �α����� : " + population.get(search));
			} else {
				System.out.println("�ش� ���� �����ϴ�.");
			}
		}
	}
}
