package sec04;

public class GasCar { // �ʵ�

	int gas; // ������

	void setGas(int gas) { // �޼ҵ�
		this.gas = gas;
		System.out.println("������ 5��ŭ �����Ǿ����ϴ�.");
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("������ �����ϴ�.");
			return false;
		}
		System.out.println("������ �ֽ��ϴ�.");
		return true; // boolean gasState�� true (GasCarExample 10�� �ڵ�)
	}

	void run() { // void�� return�� �ʿ������, ���� return���� ���ٸ� �����Ѵ�.
		while (true) {
			if (gas > 0) {
				System.out.println("�����ܷ� : " + gas);
				gas -= 1;
			} else {
				System.out.println("�����ܷ� : " + gas);
				return;
			}
		}
	}

}
