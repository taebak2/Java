package sec02;

public class �극��ũ����2 {
	/*
	  ��� ���θ� �켱 ���� + ���� ����� ���� �ݺ� ������ ���� ���� �ּ� �ѹ� ������ �����ϰ� ���� �� do while
	 */
	public static void main(String[] args) {

		do {
			int num = (int) (Math.random() * 6) + 1;
			// 1���� 6���� ���� ���� ����
			System.out.println(num);
			if (num == 6) {
				break;
			}
		} while (true);
		System.out.println("���α׷� ����");
	}

}
