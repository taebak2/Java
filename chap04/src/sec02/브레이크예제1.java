package sec02;

public class �극��ũ����1 {
// ��� ���θ� �켱 ���� + ���� ����� ���� �ݺ� ������ ���� ����
	public static void main(String[] args) {
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			// 1���� 6���� ���� ���� ����
			System.out.println(num);
			if (num == 6) {
				break;
			}
		}
		System.out.println("���α׷� ����");
	}

}
