package sec02;

public class HankookTire extends Tire {

	// �θ� Ŭ������ ������ ȣ��

	public HankookTire(int maxRotation, String location ) {
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation; // ���� ȸ���� 1�� ����

		// ����ȸ������ �ִ�ȸ���� ���� ������ ȸ���� ������Ű��
		// ��ȸ ȸ���ߴ��� (Ÿ�̾� ����) ���
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;

			// ���� ȸ������ �ִ�ȸ���� �̻��̸� Ÿ�̾� ��ũ ���
		} else {
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false;
		}
	}
}
