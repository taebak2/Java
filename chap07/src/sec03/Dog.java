package sec03;

public class Dog extends Animal { // �߻�(abstract) �޼ҵ� sound�� �������Ѿ��Ѵ�. -> override ���Ѿ��Ѵ�...

	public Dog() {
		this.kind = "������"; // Animal�� String kind ȣ��
	}

	/*
	 * public Dog(String kind) { this.kind = kind; }
	 */

	@Override
	public void sound() {
		System.out.println("�������� �۸�");

	}

}
