package sec02;

public class KumhoTire extends Tire {

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation; // ���� ȸ���� 1�� ����

		// ����ȸ������ �ִ�ȸ���� ���� ������ ȸ���� ������Ű��
		// ��ȸ ȸ���ߴ��� (Ÿ�̾� ����) ���
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;

			// ���� ȸ������ �ִ�ȸ���� �̻��̸� Ÿ�̾� ��ũ ���
		} else {
			System.out.println("*** " + location + " KumhoTire ��ũ ***");
			return false;
		}
	}
}
